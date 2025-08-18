package defpackage;

import android.text.SpannableString;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes.dex */
public final /* synthetic */ class en3 implements a66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ en3(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        mce mceVarK;
        e5f e5fVar = e5f.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (this.a) {
            case 0:
                long jLongValue = ((Long) obj).longValue();
                View view = (View) obj2;
                fn3 fn3Var = (fn3) ((a3g) obj3).Y;
                nn3 nn3Var = (nn3) obj4;
                if (!nn3Var.v0) {
                    if (nn3Var.Y == null) {
                        fn3Var.k(jLongValue, view);
                        break;
                    } else {
                        fn3Var.d(jLongValue);
                        break;
                    }
                } else {
                    fn3Var.N();
                    break;
                }
            case 1:
                List list = (List) obj;
                List list2 = (List) obj2;
                bc7[] bc7VarArr = MediaBarWidget.d1;
                if (list2.size() > list.size()) {
                    ((RecyclerView) obj4).x0(list2.size() - 1);
                }
                if (list.isEmpty() && (!list2.isEmpty())) {
                    MediaBarWidget mediaBarWidget = (MediaBarWidget) obj3;
                    LinearLayout linearLayoutR0 = mediaBarWidget.r0();
                    if (linearLayoutR0.isLaidOut() && !linearLayoutR0.isLayoutRequested()) {
                        MediaBarWidget.o0(mediaBarWidget);
                        break;
                    } else {
                        linearLayoutR0.addOnLayoutChangeListener(new k68(mediaBarWidget, 0));
                        break;
                    }
                }
                break;
            case 2:
                View view2 = (View) obj;
                rce rceVar = (rce) obj2;
                bc7[] bc7VarArr2 = MessageWriteWidget.F0;
                sv8 sv8VarQ0 = ((MessageWriteWidget) obj3).q0();
                yce yceVar = (yce) obj4;
                yceVar.o.getClass();
                CharSequence text = sv8VarQ0.getText();
                SpannableString spannableStringValueOf = text != null ? SpannableString.valueOf(text) : null;
                int iIntValue = ((Number) sv8VarQ0.getMessagePosition().getValue()).intValue();
                if (spannableStringValueOf != null && (mceVarK = ph4.k(spannableStringValueOf, iIntValue, rceVar)) != null) {
                    bc7[] bc7VarArr3 = MessageWriteWidget.F0;
                    yceVar.K0.setValue(new lce(view2, rceVar));
                    sv8VarQ0.post(new l40(spannableStringValueOf.getSpanEnd(mceVarK), 12, sv8VarQ0));
                    break;
                }
                break;
            default:
                ((Long) obj).longValue();
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                w2g w2gVar = ((y2g) obj4).F0;
                u2g u2gVar = w2gVar instanceof u2g ? (u2g) w2gVar : null;
                if (u2gVar != null) {
                    ((x2g) obj3).b(u2gVar, zBooleanValue);
                    break;
                }
                break;
        }
        return e5fVar;
    }
}
