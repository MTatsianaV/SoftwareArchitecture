package seminar_2.homework2;

public class Computer {
    private String name;
    private String cpu;
    private String ram;
    private String videoCard;
    private String hdd;

    public String getName() {
        return name;
    }

    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public String getHdd() {
        return hdd;
    }

    private
    Computer(BuilderComputer builderComputer) {
        this.name = builderComputer.name;
        this.cpu = builderComputer.cpu;
        this.ram = builderComputer.ram;
        this.videoCard = builderComputer.videoCard;
        this.hdd = builderComputer.hdd;
    }

    static class BuilderComputer {
        private String name;
        private String cpu = "AMD Ryzen 5 3600";
        private String ram = "8 Гб, DDR4";
        private String videoCard = "GeForce GTX 1660 Super ";
        private String hdd = "1000 ГБ ";

        public BuilderComputer(String name) {
            this.name = name;
        }

        public BuilderComputer setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public BuilderComputer setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public BuilderComputer setVideoCard(String videoCard) {
            this.videoCard = videoCard;
            return this;
        }

        public BuilderComputer setHdd(String hdd) {
            this.hdd = hdd;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }


    }
}
