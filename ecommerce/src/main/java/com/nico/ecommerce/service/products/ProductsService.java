package com.nico.ecommerce.service.products;

import com.nico.ecommerce.domain.Product;
import com.nico.ecommerce.dto.ProductDTO;
import com.nico.ecommerce.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class ProductsService {

    @Autowired
    private ProductsRepository productsRepository;

    /**
     * Retourne la liste de tous les produits en base
     * @return Liste de {@link ProductDTO}
     */
    public List<ProductDTO> getAll() {
        Iterable<Product> productsList = productsRepository.findAll();
        return getProductsDTOList(productsList);
    }

    /**
     * Itère la liste des produits et renseigne la liste finale des DTOs à retourner
     *
     * @param productsList
     * @return liste de {@link ProductDTO}
     */
    private List<ProductDTO> getProductsDTOList(Iterable<Product> productsList) {

        List<ProductDTO> toReturn = new ArrayList<>();

        Iterator<Product> iterator = productsList.iterator();
        while (iterator.hasNext()) {
            Product it = iterator.next();
            toReturn.add(new ProductDTO(it.getProductName(), it.getNbreEnStock(), it.getNbreEnCommande(), it.getNbreReserves()));
        }
        return toReturn;
    }
}
