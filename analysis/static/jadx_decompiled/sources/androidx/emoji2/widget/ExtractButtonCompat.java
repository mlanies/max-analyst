package androidx.emoji2.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.widget.Button;

/* loaded from: classes.dex */
public class ExtractButtonCompat extends Button {
    public ExtractButtonCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return isEnabled() && getVisibility() == 0;
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }
}
