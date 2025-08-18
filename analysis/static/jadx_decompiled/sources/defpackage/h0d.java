package defpackage;

import android.widget.AutoCompleteTextView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;

/* loaded from: classes.dex */
public abstract class h0d {
    public static void a(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.refreshAutoCompleteResults();
    }

    public static void b(SearchView$SearchAutoComplete searchView$SearchAutoComplete, int i) {
        searchView$SearchAutoComplete.setInputMethodMode(i);
    }
}
