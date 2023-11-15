package com.base.project.config;

import com.base.project.model.category.gateways.CategoryRepository;
import com.base.project.usecase.findallcategories.FindAllCategoriesUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCasesConfig {

    @Bean
    public FindAllCategoriesUseCase buildFindAllCategoriesUseCase(final CategoryRepository categoryRepository) {
        return new FindAllCategoriesUseCase(categoryRepository);
    }

}
