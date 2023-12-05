package seminar_2.homework2;

import seminar_2.homework2.Computer;

public class Program {
    public static void main(String[] args) {
        Computer computer = new Computer.BuilderComputer("FK BY Office 133506").setCpu("AMD A6-9500").
                setRam("4 ГБ").setVideoCard("Intel HD Graphics").build();
        System.out.println(computer.getName());
        System.out.println(computer.getCpu());
        System.out.println(computer.getHdd());
        System.out.println(computer.getRam());
        System.out.println(computer.getVideoCard());
    }
}
