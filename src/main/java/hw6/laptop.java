package hw6;

import java.util.Objects;

public class laptop {
    private String name;
    private String screenDiagonal;
    private String color;
    private String processes;
    private String ramSize;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScreenDiagonal() {
        return screenDiagonal;
    }

    public void setScreenDiagonal(String screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProcesses() {
        return processes;
    }

    public void setProcesses(String processes) {
        this.processes = processes;
    }

    public String getRamSize() {
        return ramSize;
    }

    public void setRamSize(String ramSize) {
        this.ramSize = ramSize;
    }

    public laptop(String name, String screenDiagonal, String color, String processes, String ramSize) {
        this.name = name;
        this.screenDiagonal = screenDiagonal;
        this.color = color;
        this.processes = processes;
        this.ramSize = ramSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        laptop laptop = (laptop) o;
        return screenDiagonal == laptop.screenDiagonal && ramSize == laptop.ramSize && name.equals(laptop.name) && color.equals(laptop.color) && processes.equals(laptop.processes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, screenDiagonal, color, processes, ramSize);
    }

    public String toString() {
        return String.format("Name: %s, Screen diagonal: %s, Color: %s, processes: %s, RAM size: %s", name, screenDiagonal, color, processes, ramSize);
    }
}





