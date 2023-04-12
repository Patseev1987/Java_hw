package Lesson6;

import java.util.Objects;

public class Laptop {
    private String brand;
    private int screenSize;
    private String processor;
    private String color;

    public Laptop(String brand, int screenSize, String processor, String color) {
        this.brand = brand;
        this.screenSize = screenSize;
        this.processor = processor;
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public String getProcessor() {
        return processor;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "Brand ---> " + brand +
                ", Screen size ---> " + screenSize +
                ", processor ---> " + processor +
                ", Color ---> " + color +
                '}' + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop that = (Laptop) o;
        if (screenSize != that.getScreenSize()) return false;

        return Objects.equals(brand, that.getBrand());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((brand == null) ? 0 : brand.hashCode());
        result = prime + screenSize;
        result = result + ((processor == null) ? 0 : processor.hashCode());
        result = result + ((color == null) ? 0 : color.hashCode());
        return result;
    }
}
