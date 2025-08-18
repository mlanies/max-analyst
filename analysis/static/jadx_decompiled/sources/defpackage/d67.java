package defpackage;

import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.coroutines.Continuation;
import one.me.inviteactions.invitebyqr.InviteByQrBottomSheet;

/* loaded from: classes2.dex */
public final class d67 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ InviteByQrBottomSheet Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d67(InviteByQrBottomSheet inviteByQrBottomSheet, Continuation continuation) {
        super(2, continuation);
        this.Y = inviteByQrBottomSheet;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        d67 d67Var = (d67) n((iqb) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        d67Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        d67 d67Var = new d67(this.Y, continuation);
        d67Var.X = obj;
        return d67Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        iqb iqbVar = (iqb) this.X;
        InviteByQrBottomSheet inviteByQrBottomSheet = this.Y;
        InviteByQrBottomSheet.A0(inviteByQrBottomSheet).setText(iqbVar.a);
        q7c q7cVar = inviteByQrBottomSheet.A0;
        CharSequence charSequence = iqbVar.b;
        if (charSequence == null || w9e.C0(charSequence)) {
            InviteByQrBottomSheet.B0(inviteByQrBottomSheet).setVisibility(8);
            ((LinearLayout.LayoutParams) InviteByQrBottomSheet.A0(inviteByQrBottomSheet).getLayoutParams()).topMargin = tu0.G(27 * fk4.d().getDisplayMetrics().density);
            ((LinearLayout.LayoutParams) ((AppCompatImageView) q7cVar.T0(inviteByQrBottomSheet, InviteByQrBottomSheet.G0[2])).getLayoutParams()).topMargin = tu0.G(15 * fk4.d().getDisplayMetrics().density);
        } else {
            InviteByQrBottomSheet.B0(inviteByQrBottomSheet).setVisibility(0);
            float f = 18;
            ((LinearLayout.LayoutParams) InviteByQrBottomSheet.A0(inviteByQrBottomSheet).getLayoutParams()).topMargin = tu0.G(fk4.d().getDisplayMetrics().density * f);
            ((LinearLayout.LayoutParams) ((AppCompatImageView) q7cVar.T0(inviteByQrBottomSheet, InviteByQrBottomSheet.G0[2])).getLayoutParams()).topMargin = tu0.G(f * fk4.d().getDisplayMetrics().density);
        }
        InviteByQrBottomSheet.B0(inviteByQrBottomSheet).setText(charSequence);
        ((AppCompatImageView) q7cVar.T0(inviteByQrBottomSheet, InviteByQrBottomSheet.G0[2])).setImageBitmap(iqbVar.c);
        return e5f.a;
    }
}
