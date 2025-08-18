package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profileedit.ProfileEditScreen;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class fgb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileEditScreen Y;
    public final /* synthetic */ View Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgb(ProfileEditScreen profileEditScreen, View view, Continuation continuation) {
        super(2, continuation);
        this.Y = profileEditScreen;
        this.Z = view;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        fgb fgbVar = (fgb) n((meb) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        fgbVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        fgb fgbVar = new fgb(this.Y, this.Z, continuation);
        fgbVar.X = obj;
        return fgbVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        meb mebVar = (meb) this.X;
        bc7[] bc7VarArr = ProfileEditScreen.y0;
        ProfileEditScreen profileEditScreen = this.Y;
        profileEditScreen.getClass();
        bc7[] bc7VarArr2 = ProfileEditScreen.y0;
        bc7 bc7Var = bc7VarArr2[4];
        q7c q7cVar = profileEditScreen.u0;
        s5a s5aVar = (s5a) q7cVar.T0(profileEditScreen, bc7Var);
        String str = mebVar.a;
        Long l = new Long(mebVar.b);
        CharSequence charSequence = mebVar.d;
        if (charSequence == null) {
            charSequence = "";
        }
        s5a.i(s5aVar, str, l, charSequence);
        ((s5a) q7cVar.T0(profileEditScreen, bc7VarArr2[4])).setAddBadgeVisibility(mebVar.f);
        int iS = au1.s(mebVar.g);
        boolean z = mebVar.e;
        if (iS == 0) {
            qm0 qm0Var = profileEditScreen.x0;
            if (!qm0Var.a()) {
                ((ViewGroup) this.Z).addView((View) qm0Var.getValue());
            }
            OneMeButton oneMeButton = (OneMeButton) qm0Var.getValue();
            oneMeButton.setVisibility(z ? 0 : 8);
            int iG = z ? (tu0.G(12 * fk4.d().getDisplayMetrics().density) * 2) + oneMeButton.getMeasuredHeight() : 0;
            RecyclerView recyclerView = (RecyclerView) profileEditScreen.Z.T0(profileEditScreen, bc7VarArr2[1]);
            recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), iG);
        } else {
            if (iS != 1) {
                throw new NoWhenBranchMatchedException();
            }
            if (z) {
                profileEditScreen.m0().setRightActions(new mka(new zfb(profileEditScreen, 5)));
            } else {
                profileEditScreen.m0().setRightActions(nka.a);
            }
        }
        return e5f.a;
    }
}
