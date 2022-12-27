package org.example.app.PropEditor;

import org.springframework.lang.Nullable;

import java.beans.PropertyEditorSupport;

public class NamePropEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(@Nullable String text) {
        setValue(text.toUpperCase());
    }
}
