package com.project.project1.persistence.crud;
import com.project.project1.persistence.entity.Producto;
import java.util.List;
import java.util.Optional;


public interface ProductoCrudRepository  {

    /*
    Si se utiliza la notacion Query (QUERY NATIVO) se puede cambiar el nombre del metodo
    se dice que es mas flexible realizar este tipo de consultas
    *
    *
    @Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true)
    List<Producto> findByIdCategoria(int idCategoria);
     */

    /*La nomenclatura nos dice que debe empezar con findBy
    * Respetando el CamelCase
    * */

    List<Producto> findAll();
    List<Producto> findByIdCategoria(int idCategoria);
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);
    List<Producto> findByNombre(String name);
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int CantidadStock, boolean estado);

}
