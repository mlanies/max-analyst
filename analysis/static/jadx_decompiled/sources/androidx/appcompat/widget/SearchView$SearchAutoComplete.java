package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import defpackage.h0d;
import defpackage.jm;
import defpackage.o0d;
import defpackage.q57;
import defpackage.vsb;

/* loaded from: classes.dex */
public class SearchView$SearchAutoComplete extends jm {
    public int s0;
    public o0d t0;
    public boolean u0;
    public final q57 v0;

    public SearchView$SearchAutoComplete(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, vsb.autoCompleteTextViewStyle);
        this.v0 = new q57(22, this);
        this.s0 = getThreshold();
    }

    private int getSearchViewTextMinWidthDp() {
        Configuration configuration = getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
            return 256;
        }
        if (i < 600) {
            return (i < 640 || i2 < 480) ? 160 : 192;
        }
        return 192;
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean enoughToFilter() {
        return this.s0 <= 0 || super.enoughToFilter();
    }

    @Override // defpackage.jm, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.u0) {
            q57 q57Var = this.v0;
            removeCallbacks(q57Var);
            post(q57Var);
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        this.t0.onTextFocusChanged();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    this.t0.clearFocus();
                    setImeVisibility(false);
                    return true;
                }
            }
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && this.t0.hasFocus() && getVisibility() == 0) {
            this.u0 = true;
            if (o0d.isLandscapeMode(getContext())) {
                h0d.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                }
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void performCompletion() {
    }

    @Override // android.widget.AutoCompleteTextView
    public final void replaceText(CharSequence charSequence) {
    }

    public void setImeVisibility(boolean z) {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        q57 q57Var = this.v0;
        if (!z) {
            this.u0 = false;
            removeCallbacks(q57Var);
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        } else {
            if (!inputMethodManager.isActive(this)) {
                this.u0 = true;
                return;
            }
            this.u0 = false;
            removeCallbacks(q57Var);
            inputMethodManager.showSoftInput(this, 0);
        }
    }

    public void setSearchView(o0d o0dVar) {
        this.t0 = o0dVar;
    }

    @Override // android.widget.AutoCompleteTextView
    public void setThreshold(int i) {
        super.setThreshold(i);
        this.s0 = i;
    }
}
