namespace ClinicService.Models.Requests
{
    public class CreatePetRequest
    {
        public int IdClient { get; set; }

        public string Name { get; set; }

        public DateTime Birthday { get; set; }
    }
}