package defpackage;

import android.text.SpannableStringBuilder;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import one.me.chats.tab.ChatsTabWidget;
import one.me.chatscreen.ChatScreen;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class fn2 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatScreen b;

    public /* synthetic */ fn2(ChatScreen chatScreen, int i) {
        this.a = i;
        this.b = chatScreen;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        spa spaVar;
        int i = 2;
        e5f e5fVar = e5f.a;
        Long l = null;
        int i2 = 3;
        int i3 = 0;
        ChatScreen chatScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = ChatScreen.k1;
                return chatScreen.D0();
            case 1:
                bc7[] bc7VarArr2 = ChatScreen.k1;
                return qp4.u0.b(chatScreen.getContext()).i();
            case 2:
                bc7[] bc7VarArr3 = ChatScreen.k1;
                w7c w7cVar = chatScreen.P0().Y0;
                je7 je7Var = iyc.a;
                fn2 fn2Var = chatScreen.F0;
                ph4 ph4Var = new ph4();
                ph4Var.a = fn2Var;
                ph4Var.b = new SpannableStringBuilder();
                return new yce(w7cVar, fn2Var, ph4Var);
            case 3:
                bc7[] bc7VarArr4 = ChatScreen.k1;
                return chatScreen.F0().u();
            case 4:
                bc7[] bc7VarArr5 = ChatScreen.k1;
                chatScreen.getClass();
                bc7[] bc7VarArr6 = ChatScreen.k1;
                bc7 bc7Var = bc7VarArr6[1];
                o92 o92Var = (o92) chatScreen.u0.a(chatScreen);
                bc7 bc7Var2 = bc7VarArr6[0];
                long jLongValue = ((Number) chatScreen.t0.a(chatScreen)).longValue();
                je7 je7Var2 = iyc.a;
                ezc ezcVar = new ezc();
                il2 il2Var = new il2(new xk1(new t03(chatScreen.P0().Y0, 11), 17), jyc.a.c());
                je7 je7Var3 = so2.a;
                to2 to2Var = to2.a;
                return new hzc(ezcVar, jLongValue, o92Var, new fl2(il2Var, to2Var.getAccessor().d(au8.class), to2Var.getAccessor().d(p82.class), to2Var.getAccessor().d(q33.class), to2Var.getDispatchers(), new qj((o45) to2Var.getAccessor().c(o45.class))));
            case 5:
                bc7[] bc7VarArr7 = ChatScreen.k1;
                pnf.o(chatScreen.H0().s0, w29.a);
                return e5fVar;
            case 6:
                bc7[] bc7VarArr8 = ChatScreen.k1;
                return chatScreen.G0();
            case 7:
                bc7[] bc7VarArr9 = ChatScreen.k1;
                xz8.y(chatScreen.F0(), false, true, 1);
                chatScreen.y0();
                return e5fVar;
            case 8:
                bc7[] bc7VarArr10 = ChatScreen.k1;
                return chatScreen.getContext();
            case 9:
                bc7[] bc7VarArr11 = ChatScreen.k1;
                chatScreen.getClass();
                bc7[] bc7VarArr12 = ChatScreen.k1;
                bc7 bc7Var3 = bc7VarArr12[1];
                int iOrdinal = ((o92) chatScreen.u0.a(chatScreen)).ordinal();
                if (iOrdinal == 0) {
                    i = 1;
                } else if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                w7c w7cVar2 = chatScreen.P0().Y0;
                bc7 bc7Var4 = bc7VarArr12[0];
                return new wza(w7cVar2, Long.valueOf(((Number) chatScreen.t0.a(chatScreen)).longValue()), i);
            case 10:
                bc7[] bc7VarArr13 = ChatScreen.k1;
                return chatScreen.getRouter();
            case 11:
                bc7[] bc7VarArr14 = ChatScreen.k1;
                if (!chatScreen.N0().b()) {
                    rq2 rq2VarP0 = chatScreen.P0();
                    e52 e52Var = (e52) rq2VarP0.Y0.a.getValue();
                    if (e52Var != null) {
                        pnf.n(rq2VarP0, ((w9a) rq2VarP0.u()).c().getImmediate(), null, new qp2(e52Var, rq2VarP0, null), 2);
                    }
                }
                return e5fVar;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                bc7[] bc7VarArr15 = ChatScreen.k1;
                return new rg1(new khe(new fn2(chatScreen, 10)), new l5g(chatScreen, 0));
            case 13:
                bc7[] bc7VarArr16 = ChatScreen.k1;
                if (chatScreen.D0() != wuc.CHAT) {
                    coc cocVar = (coc) x53.q0(chatScreen.getRouter().e());
                    Object obj = cocVar != null ? cocVar.a : null;
                    if (obj == null || obj.equals(chatScreen) || !(obj instanceof um9)) {
                        obj = null;
                    }
                    um9 um9Var = obj instanceof um9 ? (um9) obj : null;
                    return um9Var != null ? ((ChatsTabWidget) um9Var).r0() : spa.f;
                }
                e52 e52Var2 = (e52) chatScreen.P0().Y0.a.getValue();
                if (e52Var2 == null) {
                    return spa.f;
                }
                if (e52Var2.H()) {
                    zud zudVar = zud.o;
                    uj3 uj3VarL = e52Var2.l();
                    spaVar = new spa(null, 0, zudVar, uj3VarL != null ? Long.valueOf(uj3VarL.n()) : null, null, 19);
                } else if (e52Var2.M()) {
                    zud zudVar2 = zud.c;
                    uj3 uj3VarL2 = e52Var2.l();
                    spaVar = new spa(null, 0, zudVar2, uj3VarL2 != null ? Long.valueOf(uj3VarL2.n()) : null, null, 19);
                } else {
                    spaVar = new spa(null, 0, zud.X, Long.valueOf(e52Var2.b.a), null, 19);
                }
                return spaVar;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                bc7[] bc7VarArr17 = ChatScreen.k1;
                chatScreen.getClass();
                bc7[] bc7VarArr18 = ChatScreen.k1;
                bc7 bc7Var5 = bc7VarArr18[1];
                o92 o92Var2 = (o92) chatScreen.u0.a(chatScreen);
                bc7 bc7Var6 = bc7VarArr18[0];
                long jLongValue2 = ((Number) chatScreen.t0.a(chatScreen)).longValue();
                y7g y7gVar = new y7g(new fn2(chatScreen, 8));
                bc7 bc7Var7 = bc7VarArr18[3];
                return new rq2(jLongValue2, o92Var2, (String) chatScreen.w0.a(chatScreen), y7gVar);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                bc7[] bc7VarArr19 = ChatScreen.k1;
                chatScreen.getClass();
                bc7[] bc7VarArr20 = ChatScreen.k1;
                bc7 bc7Var8 = bc7VarArr20[4];
                long[] jArr = (long[]) chatScreen.x0.a(chatScreen);
                Set setN0 = jArr != null ? ys.n0(jArr) : null;
                bc7 bc7Var9 = bc7VarArr20[5];
                fs fsVar = chatScreen.y0;
                Long l2 = (Long) fsVar.a(chatScreen);
                if (l2 == null || l2.longValue() != 0) {
                    bc7 bc7Var10 = bc7VarArr20[5];
                    l = (Long) fsVar.a(chatScreen);
                }
                Long l3 = l;
                bc7 bc7Var11 = bc7VarArr20[6];
                boolean zBooleanValue = ((Boolean) chatScreen.z0.a(chatScreen)).booleanValue();
                w7c w7cVar3 = chatScreen.P0().Y0;
                je7 je7Var4 = so2.a;
                to2 to2Var2 = to2.a;
                return new xz8(setN0, l3, zBooleanValue, to2Var2.getAccessor().d(q33.class), to2Var2.getAccessor().d(kke.class), to2Var2.getAccessor().d(ds3.class), to2Var2.getAccessor().d(r79.class), tu0.r(3, new m52(29)), to2Var2.getAccessor().d(sy5.class), to2Var2.getAccessor().d(bz5.class), to2Var2.getAccessor().d(ida.class), to2Var2.getAccessor().d(vy5.class), tu0.r(3, new hn2(i3)), to2Var2.getAccessor().d(sna.class), w7cVar3);
            default:
                bc7[] bc7VarArr21 = ChatScreen.k1;
                je7 je7Var5 = so2.a;
                to2 to2Var3 = to2.a;
                return new p58(to2Var3.getAccessor().d(r79.class), to2Var3.getAccessor().d(xp7.class), to2Var3.getAccessor().d(kke.class), to2Var3.getAccessor().d(y7d.class), new fn2(chatScreen, i2));
        }
    }
}
