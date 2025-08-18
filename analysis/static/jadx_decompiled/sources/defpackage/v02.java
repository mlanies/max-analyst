package defpackage;

import android.net.Uri;
import android.view.View;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.me.chats.list.ChatsListWidget;
import one.me.contactlist.ContactListWidget;
import one.me.notifications.settings.screens.chat.ChatNotificationsSettingsScreen;
import one.me.profile.screens.members.ChatAdminsScreen;
import one.me.profile.screens.members.ChatMembersScreen;
import one.me.profile.screens.members.compact.ChatMembersCompactWidget;
import one.me.settings.privacy.ui.ChangeDisabledDialog;
import ru.ok.android.externcalls.sdk.ConversationFactory;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.events.MultiEventListener;
import ru.ok.android.externcalls.sdk.factory.JoinAnonByLinkParams;
import ru.ok.android.externcalls.sdk.id.ExternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.ParticipantsUpdater;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.tamtam.util.HandledException;

/* loaded from: classes.dex */
public final /* synthetic */ class v02 implements dk7, xha, qj3, lde, o1d, sv5, cc3, in3, grd, bce, rl, ParticipantsUpdater.MeChanger, ExternalIdsResolver.ExtraResolver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v02(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.xha
    public void I(yha yhaVar) {
        io8 io8Var = io8.a;
        yha yhaVar2 = yha.X;
        Object obj = this.b;
        switch (this.a) {
            case 3:
                bc7[] bc7VarArr = ChatAdminsScreen.w0;
                ChatAdminsScreen chatAdminsScreen = (ChatAdminsScreen) obj;
                if (yhaVar != yhaVar2) {
                    chatAdminsScreen.m0().r();
                    break;
                } else {
                    pnf.o(chatAdminsScreen.o0().Y, io8Var);
                    u52 u52VarM0 = chatAdminsScreen.m0();
                    ArrayList arrayList = u52VarM0.v0;
                    int size = arrayList.size();
                    arrayList.clear();
                    pnf.o(u52VarM0.w0, new hjb(new gqe(yea.t2, ys.m0(new Object[]{Integer.valueOf(size)}))));
                    break;
                }
            case 10:
                bc7[] bc7VarArr2 = ChatMembersCompactWidget.Z;
                ChatMembersCompactWidget chatMembersCompactWidget = (ChatMembersCompactWidget) obj;
                if (yhaVar != yhaVar2) {
                    chatMembersCompactWidget.n0().w();
                    break;
                } else {
                    pnf.o(chatMembersCompactWidget.o0().Y, io8Var);
                    chatMembersCompactWidget.n0().v();
                    break;
                }
            case 11:
                bc7[] bc7VarArr3 = ChatMembersScreen.u0;
                ChatMembersScreen chatMembersScreen = (ChatMembersScreen) obj;
                if (yhaVar != yhaVar2) {
                    chatMembersScreen.n0().w();
                    break;
                } else {
                    pnf.o(chatMembersScreen.o0().Y, io8Var);
                    chatMembersScreen.n0().v();
                    break;
                }
            default:
                if (ul3.$EnumSwitchMapping$0[yhaVar.ordinal()] == 1) {
                    jm3 jm3Var = (jm3) obj;
                    j47.T(jm3Var.a, ((w9a) jm3Var.q()).b().plus(xq9.a), null, new tl3(jm3Var, null), 2);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.bce
    public List a() {
        return (List) ((ns3) this.b).d.getValue();
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        il3 il3Var;
        int i = 0;
        ml3 ml3Var = null;
        jl3 jl3Var = null;
        l20VarE = null;
        l20 l20VarE = null;
        Object obj2 = this.b;
        switch (this.a) {
            case 4:
                u82 u82Var = (u82) obj;
                sj3[] sj3VarArr = (sj3[]) obj2;
                int length = sj3VarArr.length;
                while (i < length) {
                    sj3 sj3Var = sj3VarArr[i];
                    if (sj3Var != null) {
                        sj3Var.accept(u82Var);
                    }
                    i++;
                }
                break;
            case 6:
                u82 u82Var2 = (u82) obj;
                i92 i92Var = (i92) obj2;
                u82Var2.c = i92Var;
                if (i92Var == i92.o || i92Var == i92.b) {
                    u82Var2.x = 0L;
                    break;
                }
                break;
            case 7:
                u82 u82Var3 = (u82) obj;
                b92 b92Var = u82Var3.p;
                if (b92Var == null) {
                    b92Var = b92.h;
                }
                u82Var3.p = iz7.i((xq2) obj2, b92Var);
                break;
            case 8:
                es8 es8Var = (es8) obj;
                zf2 zf2Var = (zf2) obj2;
                zf2Var.getClass();
                hm9.n("zf2", "onMessageUpdated: messageId = " + es8Var.a.b);
                while (true) {
                    ArrayList arrayList = zf2Var.d;
                    if (i >= arrayList.size()) {
                        break;
                    } else if (((es8) arrayList.get(i)).a.b == es8Var.a.b) {
                        arrayList.set(i, es8Var);
                        for (yf2 yf2Var : zf2Var.o) {
                            if (yf2Var != null) {
                                ((ActAttachesView) yf2Var).n0(es8Var);
                            }
                        }
                        break;
                    } else {
                        i++;
                    }
                }
            case 13:
                e52 e52Var = (e52) obj;
                ks2 ks2Var = (ks2) obj2;
                pnf.n(ks2Var, ((w9a) ((kke) ks2Var.Z.getValue())).b(), null, new js2(ks2Var, e52Var, null), 2);
                pnf.o(ks2Var.A0, new rr2(e52Var.a));
                ((av0) ks2Var.v0.getValue()).c(new yxc(11));
                xx6 xx6Var = (xx6) ks2Var.u0.getValue();
                if (xx6Var != null) {
                    xx6Var.f(Collections.singleton(new wx6(ux6.Z, 1)), wuc.CHAT);
                    break;
                }
                break;
            case 16:
                hl3 hl3Var = (hl3) obj;
                qzd qzdVar = (qzd) obj2;
                if (qzdVar != null) {
                    bz bzVar = qzdVar.a;
                    if (bzVar != null) {
                        if (bzVar.a == b10.PHOTO) {
                            l20VarE = iz7.e(bzVar, null, 0L, 0L);
                        }
                    }
                    d5g d5gVar = qzdVar.b;
                    ml3Var = new ml3(l20VarE, d5gVar.a, iz7.u(d5gVar.b));
                }
                hl3Var.w = ml3Var;
                break;
            case 18:
                ((hl3) obj).i = (nl3) obj2;
                break;
            case 19:
                hl3 hl3Var2 = (hl3) obj;
                int i2 = s36.f;
                wua wuaVar = (wua) obj2;
                if (oag.t(wuaVar.u0)) {
                    hl3Var2.d = "";
                } else {
                    hl3Var2.d = wuaVar.u0;
                }
                List list = hl3Var2.f;
                Iterator it = list.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    il3Var = il3.b;
                    if (zHasNext) {
                        jl3 jl3Var2 = (jl3) it.next();
                        if (jl3Var2.c == il3Var) {
                            jl3Var = jl3Var2;
                        }
                    }
                }
                if (jl3Var != null) {
                    list.remove(jl3Var);
                }
                String str = wuaVar.s0;
                if (!oag.t(str)) {
                    String str2 = wuaVar.t0;
                    list.add(new jl3(str, il3Var, str2 != null ? str2 : ""));
                }
                hl3Var2.f = list;
                break;
            case 23:
                ((rr3) obj2).b();
                break;
            default:
                Throwable th = (Throwable) obj;
                hm9.o("rr3", th.getMessage());
                ((cba) ((o45) obj2)).c(new HandledException(th), true);
                break;
        }
    }

    @Override // defpackage.dk7
    public void b(View view, String str) {
        int i = ChangeDisabledDialog.y0;
        ChangeDisabledDialog changeDisabledDialog = (ChangeDisabledDialog) this.b;
        c54.W(changeDisabledDialog, str, new bk(5, changeDisabledDialog));
    }

    @Override // defpackage.in3
    public boolean c(int i) {
        CharSequence charSequenceN0;
        ContactListWidget contactListWidget = (ContactListWidget) this.b;
        nd3 nd3Var = contactListWidget.v0;
        int iJ = nd3Var.j();
        a3g a3gVar = contactListWidget.s0;
        if (i != iJ - a3gVar.j() || ((charSequenceN0 = contactListWidget.n0()) != null && charSequenceN0.length() != 0)) {
            if (i != nd3Var.j() - (a3gVar.j() + contactListWidget.Y.j())) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.rl
    public ql d() {
        return ConversationFactory.lambda$joinAnonByLink$14((JoinAnonByLinkParams) this.b);
    }

    public void e(ov5 ov5Var) {
        ChatsListWidget chatsListWidget = (ChatsListWidget) this.b;
        bc7[] bc7VarArr = ChatsListWidget.M0;
        nx2 nx2VarP0 = chatsListWidget.p0();
        nx2VarP0.getClass();
        String name = nx2.class.getName();
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.Y, name, "onFolderWidgetClicked " + ov5Var, null);
        }
        nv5 nv5Var = ov5Var.Y;
        if (nv5Var instanceof mv5) {
            String str = ((mv5) nv5Var).a;
            vj7 vj7Var = (vj7) nx2VarP0.C0.getValue();
            vj7Var.getClass();
            od2.L(od2.F(new zn5(vj7Var.e(Uri.parse(str)), new kw2(nx2VarP0, null), 5), ((w9a) nx2VarP0.Y).b()), nx2VarP0.a);
            return;
        }
        if (nv5Var instanceof lv5) {
            lv5 lv5Var = (lv5) nv5Var;
            pnf.o(nx2VarP0.O0, gy2.c2(gy2.c, lv5Var.a, osf.X, lv5Var.b, 0, 8));
        } else if (nv5Var != null) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // defpackage.cc3
    public Object f(bg4 bg4Var) {
        return this.b;
    }

    @Override // defpackage.lde
    public Object get() {
        ((Runnable) this.b).run();
        return null;
    }

    @Override // defpackage.o1d
    public int i(int i) {
        mfd mfdVar = ((ChatNotificationsSettingsScreen) this.b).c;
        kfd kfdVar = (kfd) ((ol7) mfdVar.C(i));
        if (kfdVar.u() == 0) {
            return 4;
        }
        if (i != mfdVar.j() - 1) {
            kfd kfdVar2 = (kfd) ((ol7) mfdVar.C(i - 1));
            kfd kfdVar3 = (kfd) ((ol7) mfdVar.C(i + 1));
            if (kfdVar.u() != kfdVar2.u()) {
                return 1;
            }
            if (kfdVar.u() == kfdVar3.u()) {
                return 2;
            }
        }
        return 3;
    }

    @Override // defpackage.grd
    public void j(nqd nqdVar) {
        nqdVar.a(Collator.getInstance(((p7b) ((m7b) this.b)).a.v()));
    }

    @Override // ru.ok.android.externcalls.sdk.id.ExternalIdsResolver.ExtraResolver
    public ParticipantId onExternalByInternalResolution(ConversationParticipant conversationParticipant) {
        return ((MultiEventListener) this.b).onExternalByInternalResolution(conversationParticipant);
    }

    @Override // ru.ok.android.externcalls.sdk.participant.ParticipantsUpdater.MeChanger
    public void updateMyExternalId(ParticipantId participantId) {
        ((ConversationParticipant) this.b).setExternalId(participantId);
    }
}
