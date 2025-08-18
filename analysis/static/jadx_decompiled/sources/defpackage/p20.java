package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import kotlin.coroutines.Continuation;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class p20 extends gmb {
    public final /* synthetic */ int F0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p20(View view, int i) {
        super(view);
        this.F0 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.CharSequence] */
    @Override // defpackage.hqd
    public final void A(ol7 ol7Var) {
        View view = this.a;
        switch (this.F0) {
            case 0:
                return;
            case 1:
                ((en2) view).setDescription(((qib) ol7Var).a);
                return;
            case 2:
                lk3 lk3Var = (lk3) view;
                ycb ycbVar = ((uib) ol7Var).a;
                lk3Var.setId(Long.hashCode(ycbVar.a));
                String str = ycbVar.d;
                lk3Var.O(ycbVar.e, ycbVar.f, str != null ? str : "");
                lk3Var.setName(ycbVar.b);
                lk3Var.setMessage(ycbVar.c.b(lk3Var.getContext()));
                return;
            case 3:
                wib wibVar = (wib) ol7Var;
                eq3 eq3Var = (eq3) view;
                jqe jqeVar = wibVar.b;
                String strB = jqeVar != null ? jqeVar.b(eq3Var.getContext()) : null;
                eq3Var.setTitle(strB != null ? strB : "");
                eq3Var.setDescription(wibVar.a);
                return;
            case 4:
                ((TextView) view).setText("#id " + ((xib) ol7Var).a);
                return;
            case 5:
                au1.r(ol7Var);
                throw null;
            case 6:
                lib libVar = (lib) ol7Var;
                OneMeButton oneMeButton = (OneMeButton) view;
                oneMeButton.setMode(libVar.c);
                oneMeButton.setSize(libVar.b);
                oneMeButton.setAppearance(libVar.o);
                oneMeButton.setText(libVar.a);
                return;
            case 7:
                ((ufd) view).setModelItem(new vfd(wea.c1, 0, new iqe(((ajb) ol7Var).a), null, null, null, null, null, new eqe(yea.I), 0, null, 1784));
                return;
            case 8:
                mib mibVar = (mib) ol7Var;
                TextView textView = (TextView) view;
                textView.setText(mibVar.a);
                v3c.y(new m1d(mibVar, (Continuation) null, 0), textView);
                kqe kqeVar = i4f.a;
                mibVar.c.b(textView, du4.b);
                return;
            default:
                cmd cmdVar = ((amd) view).o;
                cmdVar.c = true;
                cmdVar.b.c();
                return;
        }
    }

    @Override // defpackage.gmb
    public void F(gaa gaaVar) {
        switch (this.F0) {
            case 1:
                ((en2) this.a).setListener(new sy4(8, gaaVar));
                break;
            case 3:
                ((eq3) this.a).setListener(new ey1(10, gaaVar));
                break;
        }
    }

    @Override // defpackage.gmb
    public void G(View.OnClickListener onClickListener) {
        switch (this.F0) {
            case 0:
                tu0.K(this.a, 300L, onClickListener);
                break;
            case 2:
                tu0.K(this.a, 300L, onClickListener);
                break;
            case 4:
                tu0.K((TextView) this.a, 300L, onClickListener);
                break;
            case 5:
                tu0.K((TextView) this.a, 300L, onClickListener);
                break;
            case 6:
                tu0.K(this.a, 300L, onClickListener);
                break;
            case 7:
                tu0.K(this.a, 300L, onClickListener);
                break;
        }
    }

    @Override // defpackage.gmb
    public void H(View.OnLongClickListener onLongClickListener) {
        switch (this.F0) {
            case 2:
                ((lk3) this.a).setOnLongClickListener(onLongClickListener);
                break;
            case 7:
                ((ufd) this.a).setOnLongClickListener(onLongClickListener);
                break;
        }
    }

    public p20(Context context) {
        this.F0 = 8;
        TextView textView = new TextView(context);
        super(textView);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    }
}
