package ru.ok.messages.messages.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import defpackage.ax4;
import defpackage.ay4;
import defpackage.eke;
import defpackage.jyc;
import defpackage.k17;
import defpackage.lt8;
import defpackage.mt8;
import defpackage.nt8;
import defpackage.py4;
import defpackage.vl;
import defpackage.vsb;
import defpackage.y8a;
import defpackage.z16;
import one.me.android.OneMeApplication;

/* loaded from: classes2.dex */
public class MessageComposeEditText extends ax4 {
    public static final /* synthetic */ int w0 = 0;

    public MessageComposeEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, vsb.editTextStyle);
        ((OneMeApplication) ((eke) context.getApplicationContext())).getClass();
        ay4 ay4Var = (ay4) jyc.a.getAccessor().c(ay4.class);
        if (!ay4Var.e) {
            addTextChangedListener(new py4(0, ay4Var));
        }
        ((y8a) vl.b()).b();
        setReplaceTextSmiles(vl.o.a().c.g.getBoolean("app.messages.replace.emoji", false));
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection == null) {
            return null;
        }
        editorInfo.contentMimeTypes = new String[]{"image/jpeg", "image/png", "image/gif"};
        return new k17(inputConnectionOnCreateInputConnection, new z16(29, this));
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        return (i == 4 && keyEvent.getAction() == 0) ? super.onKeyPreIme(i, keyEvent) : super.onKeyPreIme(i, keyEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        getParent().requestDisallowInterceptTouchEvent(true);
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
    }

    public void setListener(lt8 lt8Var) {
    }

    public void setMIUITextSelectListener(mt8 mt8Var) {
    }

    public void setTextSelectListener(nt8 nt8Var) {
    }
}
