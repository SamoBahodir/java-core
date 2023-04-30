package com.example.stream;

class Student {
    private Integer age;
    private String lang;

    public Student(Integer age, String lang) {
        this.age = age;
        this.lang = lang;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", lang='" + lang + '\'' +
                '}';
    }
}
