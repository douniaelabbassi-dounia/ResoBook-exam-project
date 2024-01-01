
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ResourceMapper {
    ResourceMapper MAPPER = Mappers.getMapper(ResourceMapper.class);
    Resource toResource(ResourceRequestDTO resourceRequestDTO);
    ResourceResponseDTO toResourceDTO(Resource resource);
}
