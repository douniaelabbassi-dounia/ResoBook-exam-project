import lombok.*;
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor @Builder
public class ResourceRequestDTO {
    private Long id;
    private String name;
    private ResourceType type;
}
