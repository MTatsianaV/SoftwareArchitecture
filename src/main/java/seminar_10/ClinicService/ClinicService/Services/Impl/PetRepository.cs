using ClinicService.Models;
using Microsoft.Data.Sqlite;

namespace ClinicService.Services.Impl
{
    public class PetRepository : IPetRepository
    {
        private const string connectionString = "Data Source = clinic.db;";


        public int Create(Client item)
        {
            using SqliteConnection connection = new SqliteConnection();
            connection.ConnectionString = connectionString;
            connection.Open();

            using SqliteCommand command =
               new SqliteCommand("INSERT INTO pets(ClientID, Name, Birthday) VALUES(@ClientID, @Name, @Birthday)", connection);
            command.Parameters.AddWithValue("@ClientID", item.ClientID);
            command.Parameters.AddWithValue("@Name", item.Name);
            command.Parameters.AddWithValue("@Birthday", item.Birthday.Ticks);
            command.Prepare();
            return command.ExecuteNonQuery();
        }

        public int Update(Pet item)
        {
            using SqliteConnection connection = new SqliteConnection();
            connection.ConnectionString = connectionString;
            connection.Open();
            using SqliteCommand command =
                new SqliteCommand("UPDATE pets SET ClientID = @ClientID, Name = @Name, Birthday = @Birthday WHERE PetId=@PetId", connection);
            command.Parameters.AddWithValue("@PetId", item.PetId);
            command.Parameters.AddWithValue("@ClientID", item.ClientID);
            command.Parameters.AddWithValue("@Name", item.Name);
            command.Parameters.AddWithValue("@Birthday", item.Birthday.Ticks);
            command.Prepare();
            return command.ExecuteNonQuery();
        }

        public IList<Client> GetAll()
        {
            List<Pet> list = new List<Pet>();
            using SqliteConnection connection = new SqliteConnection();
            connection.ConnectionString = connectionString;
            connection.Open();
            using SqliteCommand command =
                new SqliteCommand("SELECT * FROM pets", connection);
            command.Prepare();
            using SqliteDataReader reader = command.ExecuteReader();
            while (reader.Read())
            {
                Pet pet = new Pet();
                pet.PetId = reader.GetInt32(0);
                pet.ClientID = reader.GetString(1);
                pet.Name = reader.GetString(2);
                pet.Birthday = new DateTime(reader.GetInt64(3));
                list.Add(pet);
            }
            return list;
        }

        public Pet GetById(int id)
        {
            using SqliteConnection connection = new SqliteConnection();
            connection.ConnectionString = connectionString;
            connection.Open();
            using SqliteCommand command =
                new SqliteCommand("SELECT * FROM pets WHERE PetId=@CPetId", connection);
            command.Parameters.AddWithValue("@PetId", id);
            command.Prepare();
            SqliteDataReader reader = command.ExecuteReader();
            if (reader.Read())
            {
                Pet pet = new Pet();
                pet.PetId = reader.GetInt32(0);
                pet.ClientId = reader.GetString(1);
                pet.Name = reader.GetString(2);
                pet.Birthday = new DateTime(reader.GetInt64(3));
                return pet;
            }
            return null;
        }

        public int Delete(int id)
        {
            using SqliteConnection connection = new SqliteConnection();
            connection.ConnectionString = connectionString;
            connection.Open();
            using SqliteCommand command =
                new SqliteCommand("DELETE FROM pets WHERE PetId=@PetId", connection);
            command.Parameters.AddWithValue("@PetId", id);
            command.Prepare();
            return command.ExecuteNonQuery();
        }

    }
}