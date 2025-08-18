package defpackage;

import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import one.me.profileedit.screens.memberpermissions.ProfileMemberPermissionsScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class mjb implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileMemberPermissionsScreen b;

    public /* synthetic */ mjb(ProfileMemberPermissionsScreen profileMemberPermissionsScreen, int i) {
        this.a = i;
        this.b = profileMemberPermissionsScreen;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        int i = 1;
        e5f e5fVar = e5f.a;
        ProfileMemberPermissionsScreen profileMemberPermissionsScreen = this.b;
        switch (this.a) {
            case 0:
                LinearLayout linearLayout = (LinearLayout) obj;
                int i2 = ProfileMemberPermissionsScreen.o;
                cla claVar = new cla(linearLayout.getContext(), 6);
                claVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                claVar.setTitle(vea.H1);
                claVar.setForm(uka.a);
                claVar.setTextShimmerEnabled(false);
                claVar.setLeftActions(new kka(new mjb(profileMemberPermissionsScreen, i)));
                linearLayout.addView(claVar);
                RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), null);
                recyclerView.setLayoutParams(new ti3(-1, -1));
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager());
                recyclerView.setClipToPadding(false);
                recyclerView.setPaddingRelative(recyclerView.getPaddingStart(), tu0.G(16 * fk4.d().getDisplayMetrics().density), recyclerView.getPaddingEnd(), recyclerView.getPaddingBottom());
                recyclerView.setAdapter(profileMemberPermissionsScreen.c);
                recyclerView.setItemAnimator(null);
                bi9 bi9Var = k37.a;
                bi9 bi9Var2 = new bi9(1);
                bi9Var2.g(2048);
                recyclerView.j(new q1d(qp4.u0.j(recyclerView), new y98(profileMemberPermissionsScreen, 24, bi9Var2), null, 12));
                float f = 6;
                int iG = tu0.G(fk4.d().getDisplayMetrics().density * f);
                int i3 = e37.a;
                yh9 yh9Var = new yh9();
                yh9Var.e(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, 0);
                yh9Var.e(2048, iG);
                int iG2 = tu0.G(f * fk4.d().getDisplayMetrics().density);
                yh9 yh9Var2 = new yh9();
                yh9Var2.e(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, 0);
                yh9Var2.e(2048, iG2);
                int iG3 = tu0.G(12 * fk4.d().getDisplayMetrics().density);
                int iG4 = tu0.G(24 * fk4.d().getDisplayMetrics().density);
                yh9 yh9Var3 = new yh9();
                yh9Var3.e(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, iG3);
                yh9Var3.e(2048, iG4);
                recyclerView.j(new nz7(yh9Var3, yh9Var, yh9Var2, 0));
                linearLayout.addView(recyclerView);
                break;
            default:
                int i4 = ProfileMemberPermissionsScreen.o;
                zjb zjbVarM0 = profileMemberPermissionsScreen.m0();
                zjbVarM0.getClass();
                pnf.o(zjbVarM0.x0, g43.b);
                break;
        }
        return e5fVar;
    }
}
