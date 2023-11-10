package com.digi.dto.requesdto;

import com.digi.enums.Role;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Data
@ToString
public class UserDTO {
    public static final String NAME_NULL_MSG = "User name can not be null or empty";
    public static final String NAME_REGEX = "[A-Z][a-z]";
    public static final String NAME_REGEX_MSG = "Name must start whit uppercase and contain min 3 caracters";
    public static final int NAME_MIN_LENGTH = 3;
    public static final int NAME_MAX_LENGTH = 64;
    public static final String NAME_LENGTH_MSG = "Name must have betwean " + NAME_MIN_LENGTH + " ang " + NAME_MAX_LENGTH + " characters";

    public static final String SURNAME_NULL_MSG = "User name can not be null or empty";
    public static final String SURNAME_REGEX = "[A-Z][a-z]";
    public static final String SURNAME_REGEX_MSG = "Surame must start whit uppercase and contain min 3 caracters";
    public static final int SURNAME_MIN_LENGTH = 3;
    public static final int SURNAME_MAX_LENGTH = 64;
    public static final String SURNAME_LENGTH_MSG = "Name must have betwean " + SURNAME_MIN_LENGTH + " ang " + SURNAME_MAX_LENGTH + " characters";

    public static final String EMAIL_REGEX = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    public static final String EMAIL_MSG = "not correct email format";

    @NotEmpty(message = NAME_NULL_MSG)
    @Pattern(regexp = NAME_REGEX, message = NAME_REGEX_MSG)
    @Length(min = NAME_MIN_LENGTH, max = NAME_MAX_LENGTH, message = NAME_LENGTH_MSG)
    private String name;

    @NotEmpty(message = SURNAME_NULL_MSG)
    @Pattern(regexp = SURNAME_REGEX, message = SURNAME_REGEX_MSG)
    @Length(min = SURNAME_MIN_LENGTH, max = SURNAME_MAX_LENGTH, message = SURNAME_LENGTH_MSG)
    private String surname;

    private Integer year;


    @Pattern(regexp = EMAIL_REGEX, message = EMAIL_MSG)
    private String email;
    private String password;
    private Role role;
}
