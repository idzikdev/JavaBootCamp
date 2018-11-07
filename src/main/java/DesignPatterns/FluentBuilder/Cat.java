package DesignPatterns.FluentBuilder;

public class Cat {
    private String name;
    private String sex;
    private int age;
    private int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    private Cat(Builder builder){
        setName(builder.name);
        setSex(builder.sex);
        setAge(builder.age);
        setWeight(builder.weight);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    // Klasa wewnętrzna statyczna Builder
    public static class Builder{
        String name;
        String sex;
        int age;
        int weight;

        public Builder(String name){
            this.name=name;
        }

        public Builder setSex(String sex){
            this.sex=sex;
            return this;
        }

        public Builder setAge(int age){
            this.age=age;
            return this;
        }

        public Builder setWeight(int weight){
            this.weight=weight;
            return this;
        }

        public Cat build(){
            return new Cat(this);
        }
    }
    // koniec klasy Builder



}
