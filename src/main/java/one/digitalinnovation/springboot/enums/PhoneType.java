package one.digitalinnovation.springboot.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public enum PhoneType {


    HOME(description: "Home"),
    MOBILE(description: "Mobile"),
    COMMERCIAL(description: "Commercial");

    private final String description;

}
