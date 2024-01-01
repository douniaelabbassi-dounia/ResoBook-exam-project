
import lombok.*;

@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor @Builder
public class ResourceResponseDTO {
    private Long id;
    private String name;
    private ResourceType type;
}
