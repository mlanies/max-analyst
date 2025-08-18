package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class fv5 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ TextView Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fv5(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    @Override // defpackage.c66
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        TextView textView = (TextView) obj;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                fv5 fv5Var = new fv5(3, continuation, 0);
                fv5Var.Y = textView;
                e5f e5fVar = e5f.a;
                fv5Var.o(e5fVar);
                return e5fVar;
            case 1:
                fv5 fv5Var2 = new fv5(3, continuation, 1);
                fv5Var2.Y = textView;
                e5f e5fVar2 = e5f.a;
                fv5Var2.o(e5fVar2);
                return e5fVar2;
            default:
                fv5 fv5Var3 = new fv5(3, continuation, 2);
                fv5Var3.Y = textView;
                e5f e5fVar3 = e5f.a;
                fv5Var3.o(e5fVar3);
                return e5fVar3;
        }
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                TextView textView = this.Y;
                pq9 pq9Var = qp4.u0;
                textView.setTextColor(pq9Var.j(textView).getText().e);
                textView.setBackground(new RippleDrawable(ColorStateList.valueOf(pq9Var.j(textView).d().a.a.h), null, new ColorDrawable(-1)));
                break;
            case 1:
                od2.a0(obj);
                TextView textView2 = this.Y;
                textView2.setTextColor(qp4.u0.j(textView2).getText().e);
                break;
            default:
                od2.a0(obj);
                TextView textView3 = this.Y;
                textView3.setTextColor(qp4.u0.j(textView3).getText().g);
                break;
        }
        return e5f.a;
    }
}
