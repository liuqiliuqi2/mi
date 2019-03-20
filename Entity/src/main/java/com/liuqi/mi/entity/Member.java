package com.liuqi.mi.entity;

public class Member {

    private int member_id;
    private String password;
    private String phone;
    private String name;
    private String birthday;
    private String birthdymin;
    private String birthdymax;
    private String age;
    private String agemin;
    private String agemax;
    private String sex;
    private String mail;
    private String address;
    private String describes;
    private String registerdate;
    private String registerdatemin;
    private String registerdatemax;
    private String member_state;

    private int skip;
    private int size;

    public int getMember_id() {
        return member_id;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBirthdymin() {
        return birthdymin;
    }

    public void setBirthdymin(String birthdymin) {
        this.birthdymin = birthdymin;
    }

    public String getBirthdymax() {
        return birthdymax;
    }

    public void setBirthdymax(String birthdymax) {
        this.birthdymax = birthdymax;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAgemin() {
        return agemin;
    }

    public void setAgemin(String agemin) {
        this.agemin = agemin;
    }

    public String getAgemax() {
        return agemax;
    }

    public void setAgemax(String agemax) {
        this.agemax = agemax;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescribes() {
        return describes;
    }

    public void setDescribes(String describes) {
        this.describes = describes;
    }

    public String getRegisterdate() {
        return registerdate;
    }

    public void setRegisterdate(String registerdate) {
        this.registerdate = registerdate;
    }

    public String getRegisterdatemin() {
        return registerdatemin;
    }

    public void setRegisterdatemin(String registerdatemin) {
        this.registerdatemin = registerdatemin;
    }

    public String getRegisterdatemax() {
        return registerdatemax;
    }

    public void setRegisterdatemax(String registerdatemax) {
        this.registerdatemax = registerdatemax;
    }

    public String getMember_state() {
        return member_state;
    }

    public void setMember_state(String member_state) {
        this.member_state = member_state;
    }

    public int getSkip() {
        return skip;
    }

    public void setSkip(int skip) {
        this.skip = skip;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Member{" +
                "member_id=" + member_id +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", birthdymin='" + birthdymin + '\'' +
                ", birthdymax='" + birthdymax + '\'' +
                ", age='" + age + '\'' +
                ", agemin='" + agemin + '\'' +
                ", agemax='" + agemax + '\'' +
                ", sex='" + sex + '\'' +
                ", mail='" + mail + '\'' +
                ", address='" + address + '\'' +
                ", describes='" + describes + '\'' +
                ", registerdate='" + registerdate + '\'' +
                ", registerdatemin='" + registerdatemin + '\'' +
                ", registerdatemax='" + registerdatemax + '\'' +
                ", member_state='" + member_state + '\'' +
                ", skip=" + skip +
                ", size=" + size +
                '}';
    }

}
