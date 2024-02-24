package com.roze.java17.annotations.customAnnotationsDeclare;

public @interface Version {
    int major();

    int minor();
}

@Version(major = 1, minor = 0)
class VersionTest {
    //annotation for instance variable
    @Version(major = 1, minor = 0)
    private int xyz;

    //annotation for constructor VersionTest()
    @Version(major = 1, minor = 0)
    public VersionTest() {

    }

    //annotation for constructor VersionTest(int xyz)
    @Version(major = 1, minor = 0)
    public VersionTest(int xyz) {
        this.xyz = xyz;
    }

    //annotation for printValue() method
    @Version(major = 1, minor = 0)
    public void printValue() {

    }

    //annotation for setXyz() method
    @Version(major = 1, minor = 0)
    public void setXyz(int xyz) {
        //annotation for local variable newValue
        @Version(major = 1, minor = 2)
        int newValue = 114;
        this.xyz = xyz;

    }

}
