package defpackage;

import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class tt5 extends hqd {
    public final cka F0;
    public jt5 G0;

    public tt5(View view) {
        FrameLayout frameLayout = new FrameLayout(view.getContext());
        super(frameLayout);
        cka ckaVar = new cka(frameLayout.getContext());
        this.F0 = ckaVar;
        frameLayout.setId(dwb.oneme_folders_edit_folder_name_field);
        frameLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        ckaVar.setHint(z7.B(ckaVar.getContext(), qba.j));
        ckaVar.b(new jy2(14, this));
        ckaVar.setFilters(new InputFilter[]{new InputFilter.LengthFilter(20)});
        frameLayout.addView(ckaVar, new FrameLayout.LayoutParams(-1, -2, 17));
        v3c.y(new xh0(this, (Continuation) null, 12), frameLayout);
    }

    @Override // defpackage.hqd
    public final void D() {
        this.G0 = null;
    }

    @Override // defpackage.hqd
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final void A(st5 st5Var) {
        cka ckaVar = this.F0;
        boolean z = st5Var.b;
        ckaVar.setEnabled(z);
        ckaVar.setTextColorAttr(z ? wfa.W : wfa.T);
        if (ckaVar.getText().length() == 0) {
            jqe jqeVar = st5Var.a;
            CharSequence charSequenceA = jqeVar != null ? jqeVar.a(this) : null;
            if (charSequenceA == null) {
                charSequenceA = "";
            }
            ckaVar.setText(charSequenceA);
        }
        ckaVar.setFilters(new InputFilter[]{new InputFilter.LengthFilter(st5Var.c)});
        this.G0 = null;
    }
}
