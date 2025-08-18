package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import one.me.calls.ui.ui.settings.CallAdminSettingsScreen;
import one.me.folders.picker.FolderMemberPickerScreen;
import one.me.profile.ProfileScreen;
import one.me.sdk.messagewrite.MessageWriteWidget;
import one.me.startconversation.chattitleicon.ChatTitleIconScreen;

/* loaded from: classes.dex */
public final class c01 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c01(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        int i = 3;
        int i2 = 4;
        e5f e5fVar = e5f.a;
        Object obj2 = this.b;
        switch (this.a) {
            case 0:
                ((CallAdminSettingsScreen) obj2).getRouter().C();
                break;
            case 1:
                ConstraintLayout constraintLayout = (ConstraintLayout) obj;
                bc7[] bc7VarArr = ChatTitleIconScreen.z0;
                ChatTitleIconScreen chatTitleIconScreen = (ChatTitleIconScreen) obj2;
                chatTitleIconScreen.getClass();
                bc7[] bc7VarArr2 = ChatTitleIconScreen.z0;
                bc7 bc7Var = bc7VarArr2[3];
                qm0 qm0Var = chatTitleIconScreen.u0;
                constraintLayout.addView((TextView) qm0Var.getValue());
                constraintLayout.addView(ChatTitleIconScreen.n0(chatTitleIconScreen));
                constraintLayout.addView(chatTitleIconScreen.o0());
                if (chatTitleIconScreen.q0() == pyd.o) {
                    constraintLayout.addView(ChatTitleIconScreen.m0(chatTitleIconScreen));
                }
                constraintLayout.addView(chatTitleIconScreen.p0());
                dj3 dj3VarQ = fp3.q(constraintLayout);
                bc7 bc7Var2 = bc7VarArr2[3];
                int id = ((TextView) qm0Var.getValue()).getId();
                bc7 bc7Var3 = bc7VarArr2[2];
                dj3VarQ.d(id, 3, ((cla) chatTitleIconScreen.t0.getValue()).getId(), 4);
                au1.p(16, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, i, id, i2));
                dj3VarQ.d(id, 6, 0, 6);
                dj3VarQ.d(id, 7, 0, 7);
                int id2 = ChatTitleIconScreen.n0(chatTitleIconScreen).getId();
                bc7 bc7Var4 = bc7VarArr2[3];
                dj3VarQ.d(id2, 3, ((TextView) qm0Var.getValue()).getId(), 4);
                float f = 24;
                au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, i, id2, i2));
                dj3VarQ.d(id2, 6, 0, 6);
                dj3VarQ.d(id2, 7, 0, 7);
                int id3 = chatTitleIconScreen.o0().getId();
                dj3VarQ.d(id3, 3, ChatTitleIconScreen.n0(chatTitleIconScreen).getId(), 4);
                au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, i, id3, i2));
                dj3VarQ.d(id3, 6, 0, 6);
                dj3VarQ.d(id3, 7, 0, 7);
                int id4 = ChatTitleIconScreen.m0(chatTitleIconScreen).getId();
                dj3VarQ.d(id4, 3, chatTitleIconScreen.o0().getId(), 4);
                float f2 = 8;
                au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, i, id4, i2));
                dj3VarQ.d(id4, 6, 0, 6);
                dj3VarQ.d(id4, 7, 0, 7);
                View viewM0 = ChatTitleIconScreen.m0(chatTitleIconScreen).getVisibility() == 0 ? ChatTitleIconScreen.m0(chatTitleIconScreen) : chatTitleIconScreen.o0();
                int id5 = chatTitleIconScreen.p0().getId();
                dj3VarQ.d(id5, 3, viewM0.getId(), 4);
                au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, i, id5, i2));
                dj3VarQ.d(id5, 6, 0, 6);
                dj3VarQ.d(id5, 7, 0, 7);
                dj3VarQ.d(id5, 4, 0, 4);
                dj3VarQ.g(id5).d.x = 1.0f;
                dj3VarQ.a(constraintLayout);
                break;
            case 2:
                nn3 nn3Var = (nn3) obj;
                ((nx2) obj2).R0.g(nn3Var.a, nn3Var.w0);
                break;
            case 3:
                bc7[] bc7VarArr3 = FolderMemberPickerScreen.y0;
                FolderMemberPickerScreen folderMemberPickerScreen = (FolderMemberPickerScreen) obj2;
                su5 su5Var = (su5) folderMemberPickerScreen.v0().c;
                bc7 bc7Var5 = FolderMemberPickerScreen.y0[0];
                String str = (String) folderMemberPickerScreen.w0.a(folderMemberPickerScreen);
                if (!su5Var.g) {
                    su5Var.g = true;
                    sx3 sx3Var = su5Var.f;
                    if (sx3Var != null) {
                        j47.S(sx3Var, xq9.a.plus(((w9a) ((kke) su5Var.c.getValue())).b()), vx3.c, new ru5(su5Var, str, null));
                        break;
                    }
                }
                break;
            case 4:
                if (((Boolean) obj).booleanValue()) {
                    lea leaVar = (lea) obj2;
                    EditText editText = leaVar.w0;
                    editText.requestFocus();
                    editText.post(new do9(leaVar, i, editText));
                    leaVar.setOnWindowFocusChanged(null);
                    break;
                }
                break;
            case 5:
                bc7[] bc7VarArr4 = MessageWriteWidget.F0;
                MessageWriteWidget messageWriteWidget = (MessageWriteWidget) obj2;
                xz8 xz8VarV0 = messageWriteWidget.v0();
                xz8VarV0.M0.setValue(null);
                ((t33) ((q33) xz8VarV0.c.getValue())).j("app.onboarding.author_visibility", true);
                messageWriteWidget.C0(new eqe(yoc.i0), true);
                break;
            case 6:
                try {
                    ((b8c) obj2).d();
                    break;
                } catch (Throwable unused) {
                    break;
                }
            case 7:
                bc7[] bc7VarArr5 = eya.F0;
                ((eya) obj2).r().i = null;
                break;
            case 8:
                ((ry1) obj2).resumeWith(e5fVar);
                break;
            case 9:
                bc7[] bc7VarArr6 = ProfileScreen.D0;
                cnb cnbVarR0 = ((ProfileScreen) obj2).r0();
                ka1 ka1VarE = cnbVarR0.O0.e();
                if (ka1VarE != null) {
                    pnf.o(cnbVarR0.A0, ka1VarE);
                    break;
                }
                break;
            default:
                ((zl4) obj2).g();
                break;
        }
        return e5fVar;
        return e5fVar;
    }
}
