package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class g2b extends kgb {
    public final /* synthetic */ int F0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g2b(View view) {
        super(view);
        this.F0 = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.CharSequence] */
    @Override // defpackage.hqd
    public final void A(ol7 ol7Var) {
        Continuation continuation = null;
        View view = this.a;
        switch (this.F0) {
            case 0:
                TextView textView = (TextView) view;
                ?? B = ((n2b) ol7Var).a.b(textView.getContext());
                textView.setText(B != 0 ? B : "");
                v3c.y(new v9(3, null, 20), textView);
                break;
            case 1:
                s0d s0dVar = (s0d) ol7Var;
                TextView textView2 = (TextView) view;
                ?? B2 = s0dVar.a.b(textView2.getContext());
                textView2.setText(B2 != 0 ? B2 : "");
                v3c.y(new c3(s0dVar, continuation, 29), textView2);
                kqe kqeVar = i4f.a;
                s0dVar.c.b(textView2, du4.b);
                break;
            default:
                break;
        }
    }

    public g2b(Context context, int i) {
        this.F0 = i;
        switch (i) {
            case 2:
                ufd ufdVar = new ufd(context, null);
                super(ufdVar);
                ufdVar.setModelItem(new vfd(8, 0, new eqe(vea.D0), null, new eqe(vea.A0), null, null, null, null, 0, null, 1864));
                break;
            default:
                TextView textView = new TextView(context);
                super(textView);
                textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                break;
        }
    }
}
