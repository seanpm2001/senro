package ro.siveco.svapnt.configuration.entity;

import javax.persistence.*;
import static javax.persistence.DiscriminatorType.*;
import ro.siveco.svapnt.configuration.generated.entity.PredefinedEntityRightBase;
import ro.siveco.svapnt.common.session.EntityBeansRepositoryImpl;

/**
 * <p>
 * Drepturi predefinite pe entitati<br>
 * </p>
 * <p>
 * Nu exista o cerinta de date corespondenta in documentul
 * dictionar de date
 * </p>
 *
 *
 */

@NamedQueries
    (
    {
/* Unique Keys */

                                                                                                                             
	//Unique keys methods with Relations as parameters

    @NamedQuery
        (
            name = PredefinedEntityRightBase.NQ_findByModelEntity,
            query = "select object(o) from " + PredefinedEntityRight.ENTITY_NAME + " o where " +
                    "o.modelEntity.id = ?1"
        ),


//model defined finders


    @NamedQuery
        (
            name = "configuration_PredefinedEntityRight_getAll",
            query = "from " + PredefinedEntityRight.ENTITY_NAME
        )

    }
    )
@Entity( name = PredefinedEntityRight.ENTITY_NAME )
@Table( name = "CFG_PREDEFINED_ENTITY_RIGHTS" )
@DiscriminatorValue( "-1" )
@DiscriminatorColumn( name = "ENTITY_ID", discriminatorType = INTEGER )
public class PredefinedEntityRight extends PredefinedEntityRightBase implements java.io.Serializable
{
    // Inserati cod aici; adaugati numai proprietati marcate cu @Transient; nu modificati liniile de mai sus
    // Insert code here; only add @Transient properties; do not modify lines above
    static {
        EntityBeansRepositoryImpl.getInstance().addEntity(PredefinedEntityRight.ENTITY_NAME, PredefinedEntityRight.class);
    }
   
}
