package org.senro.gwt.client.model.ui.component;

import org.senro.gwt.client.model.ui.binding.DataModel;
import org.senro.gwt.client.model.ui.binding.StringModel;

import com.extjs.gxt.ui.client.widget.button.Button;

public class SenroButton extends Button {
	private DataModel<StringModel> model;
	
	public SenroButton( DataModel<StringModel> model ) {
		this.model = model;
		
		if( model.getDataObject() != null )
			setText(model.getDataObject().getValue());
	}
	
	public DataModel<StringModel> getDataModel() {
		return model;
	}

	public void setDataModel(DataModel<StringModel> model) {
		this.model = model;
	} 
}
