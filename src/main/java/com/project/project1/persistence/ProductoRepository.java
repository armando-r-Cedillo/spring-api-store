package com.project.project1.persistence;

import com.project.project1.domain.Product;
import com.project.project1.domain.repository.ProductRepository;
import com.project.project1.persistence.crud.ProductoCrudRepository;
import com.project.project1.persistence.entity.Producto;
import com.project.project1.persistence.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;



/*@Component  es una generalizacion de las anotaciones pero queda mejor
* con  @Repository porque se indica de una manera mas directa que tipo de componente es*/
/*Hay que agregar esta anotacion para indicarle a spring que estamos interactuando con la base de datos*/
@Repository
public class ProductoRepository  {

    /*
    * Si no se inicializa las interfaces es decir
    * crear un objeto tendremos un null, por lo
    * que utilizamos los inyectores con autowired
    * OJO hay que inyectar una dependencia (componentes) (objeto) es un componente
    * de spring
    * En productoCrudRepository se puede insertar debido que dicha interface
    * esta heredando una clase que cuenta anotaciones de spring la cual
    * es CrudRepository
    *  */
//    @Autowired
//    private ProductoCrudRepository productoCrudRepository;
//    /*
//    * En el caso de productMapper se toma como inyeccion de dependencia
//    * debido que aunque se esta utilizando un Mapper en los parametros
//    * se indica que es un modelo componente de spring
//    * ( componentModel = "spring" )
//    * */
//    @Autowired
//    private ProductMapper productMapper;
//
//    @Override
//    public List<Product> getAll(){
//        List<Producto> productos = (List<Producto>) productoCrudRepository.findAll();
//        return productMapper.toProducts(productos);
//        //return productMapper.toProducts(productoCrudRepository.findAll());
//    }
//
//    @Override
//    public Optional<List<Product>> getByCategory(int categoryId) {
//        List<Producto> productos = productoCrudRepository.findByIdCategoria(categoryId);
//        return Optional.of(productMapper.toProducts(productos));
//    }
//
//    @Override
//    public Optional<List<Product>> getScarseProducts(int quantity) {
//        Optional<List<Producto>> productos = productoCrudRepository.findByCantidadStockLessThanAndEstado(quantity,true);
//        /*
//        * la funcion Map de optional nos retorna un Optional solamente se le aplica
//        * una funcion lambda (arrow function)
//        * */
//        return productos.map(prods -> productMapper.toProducts(prods ));
//    }
//
//    @Override
//    public Optional<Product> getProduct(int productId) {
//        return productoCrudRepository.findById(productId).map(producto -> productMapper.toProduct(producto));
//    }
//    @Override
//    public Product save(Product product) {
//        Producto producto = productMapper.toProducto(product);
//        return productMapper.toProduct(productoCrudRepository.save(producto));
//    }
//    @Override
//    public void delete(int productId) {
//        productoCrudRepository.deleteById(productId);
//    }
//
//    public void deleteById(int id){
//        productoCrudRepository.deleteById(id);
//    }
//
//
//    public List<Producto> getByCategoriaAndOrderAsc(int idCategoria){
//        return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
//    }
//
//    public  List<Producto> getByNombre(String Nombre){
//        return productoCrudRepository.findByNombre(Nombre);
//    }

//    public Optional<List<Producto>> getCasos(int cantidad){
//        if (productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad,true).isPresent())
//            return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad,true);
//        return  null;
//    }


}
