/**
 * The MIT License (MIT)
 * <p>
 * Copyright (c) 2015 the original author or authors.
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.wandrell.pattern.test.integration.repository.access.sqlite.eclipselink;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;

import com.wandrell.pattern.test.util.config.context.PersistenceContextConfig;
import com.wandrell.pattern.test.util.config.context.RepositoryContextConfig;
import com.wandrell.pattern.test.util.config.context.TestContextConfig;
import com.wandrell.pattern.test.util.config.properties.DatabaseScriptsPropertiesConfig;
import com.wandrell.pattern.test.util.config.properties.JDBCPropertiesConfig;
import com.wandrell.pattern.test.util.config.properties.JPAPropertiesConfig;
import com.wandrell.pattern.test.util.config.properties.PersistenceProviderPropertiesConfig;
import com.wandrell.pattern.test.util.config.properties.QueryPropertiesConfig;
import com.wandrell.pattern.test.util.config.properties.RepositoryPropertiesConfig;
import com.wandrell.pattern.test.util.config.properties.TestPropertiesConfig;
import com.wandrell.pattern.test.util.config.properties.UserPropertiesConfig;

/**
 * Integration tests for
 * {@link com.wandrell.pattern.repository.jpa.JPARepository JPARepository}
 * implementing {@code AbstractITModify}, using a SQLite database and
 * Eclipselink-based JPA.
 *
 * @author Bernardo Martínez Garrido
 * @see com.wandrell.pattern.repository.jpa.JPARepository JPARepository
 */
@ContextConfiguration(locations = { TestContextConfig.DEFAULT,
        TestContextConfig.ENTITY_MODIFIABLE,
        PersistenceContextConfig.ECLIPSELINK, RepositoryContextConfig.JPA })
@TestPropertySource(
        locations = { QueryPropertiesConfig.JPA_QUERY,
                RepositoryPropertiesConfig.JPA, TestPropertiesConfig.ENTITY_JPA,
                PersistenceProviderPropertiesConfig.ECLIPSELINK,
                UserPropertiesConfig.DEFAULT,
                DatabaseScriptsPropertiesConfig.PLAIN,
                JDBCPropertiesConfig.SQLITE, JPAPropertiesConfig.SQLITE },
        properties = {
                "jpa.persistenceUnitName=test_model_jpa_eclipselink_sqlite_modify",
                "jdbc.url=jdbc:sqlite:target/sqlite_test_jpa_eclipselink_modify.db" })
public final class ITModifySQLiteEclipselinkJPARepository {

    /**
     * Default constructor.
     */
    public ITModifySQLiteEclipselinkJPARepository() {
        super();
        // TODO: Not working
    }

}