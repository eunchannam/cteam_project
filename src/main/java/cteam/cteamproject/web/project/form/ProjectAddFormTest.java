package cteam.cteamproject.web.project.form;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter @Setter
public class ProjectAddFormTest {

    @NotEmpty
    private String projectName;

    private String techList;

    private String details;
}
