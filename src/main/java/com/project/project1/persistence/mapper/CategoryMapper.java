package com.project.project1.persistence.mapper;
import com.project.project1.domain.Category;
import com.project.project1.persistence.entity.Categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    /*Importante que reciba este nombre toCategory*/
    @Mappings({
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "descripcion" ,target = "category"),
            @Mapping(source ="estado" , target = "active")
    })
    Category toCategory(Categoria Categoria);

    /*Con esta notacion ya sabe que tiene que hacer el mapeo inverso*/
    @InheritInverseConfiguration
    @Mapping(target = "productos",ignore = true)
    Categoria toCategoria(Category category);
}
