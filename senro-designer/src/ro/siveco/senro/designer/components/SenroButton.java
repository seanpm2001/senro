package ro.siveco.senro.designer.components;

import ro.siveco.senro.designer.basic.SenroDesignerObject;
import ro.siveco.senro.designer.basic.DesignerObjectListener;

import javax.swing.*;

import org.apache.commons.lang.ObjectUtils;

import java.util.Map;

public class SenroButton extends JButton implements SenroDesignerObject
{
    private String entity;
    private String task;
    private String buttonIcon;
    private String hoverIcon;

    private String senroId = "";
    private String senroName = "";

    public SenroButton()
    {
        setText("Button");
    }

    public SenroButton(Icon icon)
    {
        super(icon);
        setText("Button");
    }

    public SenroButton(Action a)
    {
        super(a);
        setText("Button");
    }

    public SenroButton(String text)
    {
        super(text);
    }

    public SenroButton(String text, Icon icon)
    {
        super(text, icon);
    }

    public String getEntity()
    {
        return (entity == null ? "" : entity);
    }

    public void setEntity(String entity)
    {
        this.entity = entity;
    }

    public String getTask()
    {
        return (task == null ? "" : task);
    }

    public void setTask(String task)
    {
        this.task = task;
    }

    public String getButtonIcon()
    {
        return (buttonIcon == null ? "" : buttonIcon);
    }

    public void setButtonIcon(String buttonIcon)
    {
        this.buttonIcon = buttonIcon;
    }

    public String getHoverIcon()
    {
        return (hoverIcon == null ? "" : hoverIcon);
    }

    public void setHoverIcon(String hoverIcon)
    {
        this.hoverIcon = hoverIcon;
    }

    public String getName()
    {
        return senroName == null || senroName.length() == 0 ? senroId : senroName;
    }

    public void setName(String obj_name)
    {
        if(ObjectUtils.equals(senroName, obj_name)) {
            return;
        }
        senroName = obj_name == null ? "" : obj_name;
        super.setName(senroName);
    }

    public String getId()
    {
        return senroId == null || senroId.length() == 0 ? senroName : senroId;
    }

    public void setId(String obj_id)
    {
        if(ObjectUtils.equals(senroId, obj_id)) {
            return;
        }
        senroId = obj_id == null ? "" : obj_id;
    }

    public void addListener(DesignerObjectListener listener)
    {
    }

    public void removeListener(DesignerObjectListener listener)
    {
    }

    public void updateLinks(Map<String, SenroDesignerObject> obj_map)
    {
    }

}
