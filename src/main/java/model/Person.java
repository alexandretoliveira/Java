package model;

public class Person implements  Comparable{
    private String name;
    private String lastName;
    private Integer age;

    public Person(String name, String lastName, Integer age){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the lasName
     */
    public String getLasName() {
        return lastName;
    }
    /**
     * @param lasName the lasName to set
     */
    public void setLasName(String lasName) {
        this.lastName = lasName;
    }
    /**
     * @return the age
     */
    public Integer getAge() {
        return age;
    }
    /**
     * @param age the age to set
     */
    public void setAge(Integer age) {
        this.age = age;
    }



    public int compareTo(Object o) {
        if(((Person)o).getName().compareTo(this.getName()) > 0)
            return -1;
        return 1;
    }
}