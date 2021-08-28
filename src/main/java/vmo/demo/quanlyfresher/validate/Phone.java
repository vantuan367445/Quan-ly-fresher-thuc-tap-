package vmo.demo.quanlyfresher.validate;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;
//validate cho thuộc tính số điện thoại
@Documented
@Constraint(validatedBy = PhoneValidator.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD, ElementType.METHOD })
public @interface Phone {
    String message() default "{Phone}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}