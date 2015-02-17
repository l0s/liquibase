package liquibase.actionlogic.core.h2;

import liquibase.Scope;
import liquibase.action.Action;
import liquibase.action.core.SetNullableAction;
import liquibase.action.core.StringClauses;
import liquibase.actionlogic.core.SetNullableLogic;
import liquibase.database.Database;
import liquibase.database.core.h2.H2Database;
import liquibase.datatype.DataTypeFactory;
import liquibase.exception.ValidationErrors;

public class SetNullableLogicH2 extends SetNullableLogic {

    @Override
    protected Class<? extends Database> getRequiredDatabase() {
        return H2Database.class;
    }


    @Override
    protected StringClauses generateSql(Action action, Scope scope) {
        return super.generateSql(action, scope)
                .prepend("SET");
    }

}