package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import defpackage.rsb;

/* loaded from: classes.dex */
public class DropDownPreference extends ListPreference {
    public final ArrayAdapter v0;

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, rsb.dropdownPreferenceStyle);
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_dropdown_item);
        this.v0 = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.t0;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void b() {
        ArrayAdapter arrayAdapter = this.v0;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }
}
