package defpackage;

import one.me.chats.search.ChatsListSearchScreen;
import one.me.chats.search.views.ClearRecentSearchBottomSheet;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.messagewrite.MessageWriteWidget;
import one.me.webapp.rootscreen.WebAppRootScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class e09 extends p66 implements k56 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e09(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [uu3] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36, types: [uu3] */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r1v51 */
    @Override // defpackage.k56
    public final Object invoke() {
        uj3 uj3VarL;
        znc zncVarT;
        mv8 mv8Var = mv8.a;
        nv8 nv8Var = nv8.a;
        e5f e5fVar = e5f.a;
        switch (this.a) {
            case 0:
                MessageWriteWidget messageWriteWidget = (MessageWriteWidget) this.receiver;
                if (!br7.H(messageWriteWidget.x0) || (!tpa.f(messageWriteWidget.q0().getSendActionState(), nv8Var) && !tpa.f(messageWriteWidget.q0().getSendActionState(), mv8Var))) {
                    CharSequence text = messageWriteWidget.q0().getText();
                    if ((text != null && text.length() != 0) || messageWriteWidget.q0().getEmojiExpandableState() == iv8.a) {
                        messageWriteWidget.A0();
                        break;
                    } else {
                        xz8.z(messageWriteWidget.v0(), 0, 3);
                        break;
                    }
                } else {
                    messageWriteWidget.y0();
                    break;
                }
                break;
            case 1:
                MessageWriteWidget messageWriteWidget2 = (MessageWriteWidget) this.receiver;
                bc7[] bc7VarArr = MessageWriteWidget.F0;
                CharSequence text2 = messageWriteWidget2.q0().getText();
                if ((text2 != null && !w9e.C0(text2)) || messageWriteWidget2.v0().t()) {
                    if (!br7.H(messageWriteWidget2.x0) || (!tpa.f(messageWriteWidget2.q0().getSendActionState(), nv8Var) && !tpa.f(messageWriteWidget2.q0().getSendActionState(), mv8Var))) {
                        messageWriteWidget2.v0().B(text2, true);
                        messageWriteWidget2.q0().setText(null);
                        break;
                    } else {
                        messageWriteWidget2.y0();
                        break;
                    }
                }
                break;
            case 2:
                e52 e52Var = (e52) ((xz8) this.receiver).b.getValue();
                if (e52Var != null && (uj3VarL = e52Var.l()) != null) {
                    long jN = uj3VarL.n();
                    wy8 wy8Var = wy8.c;
                    Long lValueOf = Long.valueOf(e52Var.a);
                    f64 f64VarP1 = wy8Var.P1();
                    y7g y7gVar = new y7g(13);
                    y7gVar.b = ":webapp:root";
                    y7gVar.D(Long.valueOf(jN), "bot_id");
                    y7gVar.D("start_button", "entry_point");
                    y7gVar.D(lValueOf, "chat_id");
                    f64VarP1.c(y7gVar.r(), null);
                    break;
                }
                break;
            case 3:
                ((i3a) this.receiver).f();
                break;
            case 4:
                ((i3a) this.receiver).f();
                break;
            case 5:
                break;
            case 6:
                ChatsListSearchScreen chatsListSearchScreen = ((jv2) this.receiver).a;
                mr0.G(chatsListSearchScreen);
                bc7[] bc7VarArr2 = BottomSheetWidget.x0;
                ClearRecentSearchBottomSheet clearRecentSearchBottomSheet = new ClearRecentSearchBottomSheet();
                clearRecentSearchBottomSheet.setTargetController(chatsListSearchScreen);
                ?? parentController = chatsListSearchScreen;
                while (parentController.getParentController() != null) {
                    parentController = parentController.getParentController();
                }
                foc focVar = parentController instanceof foc ? (foc) parentController : null;
                zncVarT = focVar != null ? focVar.T() : null;
                clearRecentSearchBottomSheet.z0(chatsListSearchScreen);
                if (zncVarT != null) {
                    coc cocVar = new coc(clearRecentSearchBottomSheet, null, null, null, false, -1);
                    wg0.l(false, cocVar, true, "BottomSheetWidget");
                    zncVarT.G(cocVar);
                    break;
                }
                break;
            case 7:
                add addVar = (add) this.receiver;
                String str = ((did) addVar.B0.getValue()).b;
                s35 s35Var = addVar.z0;
                if (str != null) {
                    Long lT = addVar.t();
                    if (lT != null) {
                        pnf.o(s35Var, new xgd(lT.longValue()));
                        break;
                    }
                } else {
                    pnf.o(s35Var, tgd.b);
                    break;
                }
                break;
            case 8:
                add addVar2 = (add) this.receiver;
                j47.T(addVar2.a, ((w9a) addVar2.r()).a(), null, new qcd(addVar2, null), 2);
                break;
            case 9:
                add addVar3 = (add) this.receiver;
                j47.T(addVar3.a, ((w9a) addVar3.r()).a(), null, new rcd(addVar3, null), 2);
                break;
            case 10:
                ad7 ad7Var = (ad7) this.receiver;
                ad7Var.getClass();
                sc7 sc7Var = sc7.c;
                long j = ad7Var.b.getLong("arg_key_chat_id");
                sc7Var.P1().b(":stickers/search?chat_id=" + j, null);
                break;
            case 11:
                ad7 ad7Var2 = (ad7) this.receiver;
                ad7Var2.getClass();
                bc7[] bc7VarArr3 = KeyboardStickersWidget.t0;
                KeyboardStickersWidget keyboardStickersWidget = ad7Var2.a;
                keyboardStickersWidget.getClass();
                bc7[] bc7VarArr4 = BottomSheetWidget.x0;
                lg3 lg3VarE = wg0.e(kca.o, 6, null);
                lg3VarE.a(new mg3(jca.g, new eqe(kca.m), 1, false), new mg3(jca.h, new eqe(kca.n), 2, false));
                ConfirmationBottomSheet confirmationBottomSheetE = lg3VarE.e();
                confirmationBottomSheetE.setTargetController(keyboardStickersWidget);
                ?? parentController2 = keyboardStickersWidget;
                while (parentController2.getParentController() != null) {
                    parentController2 = parentController2.getParentController();
                }
                foc focVar2 = parentController2 instanceof foc ? (foc) parentController2 : null;
                zncVarT = focVar2 != null ? focVar2.T() : null;
                confirmationBottomSheetE.z0(keyboardStickersWidget);
                if (zncVarT != null) {
                    coc cocVar2 = new coc(confirmationBottomSheetE, null, null, null, false, -1);
                    wg0.l(false, cocVar2, true, "BottomSheetWidget");
                    zncVarT.G(cocVar2);
                    break;
                }
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                rge rgeVar = (rge) this.receiver;
                rgeVar.f = false;
                rgeVar.g = -1.0f;
                rgeVar.h = -1.0f;
                break;
            case 13:
                ((kee) this.receiver).close();
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                ouf oufVarS = ((zzf) this.receiver).s();
                j47.T(oufVarS.c, ((w9a) oufVarS.e()).a(), null, new ttf(oufVarS, null), 2);
                break;
            case 16:
                ouf oufVarS2 = ((zzf) this.receiver).s();
                oufVarS2.getClass();
                j47.T(oufVarS2.c, null, null, new stf(oufVarS2, null), 3);
                break;
            case LangUtils.HASH_SEED /* 17 */:
                WebAppRootScreen webAppRootScreen = (WebAppRootScreen) this.receiver;
                bc7[] bc7VarArr5 = WebAppRootScreen.G0;
                webAppRootScreen.getClass();
                zud zudVar = zud.Z;
                bc7 bc7Var = WebAppRootScreen.G0[1];
                break;
            case 18:
                p0g p0gVar = (p0g) this.receiver;
                j47.T(p0gVar.a, ((w9a) ((kke) p0gVar.s0.getValue())).b(), null, new n0g(p0gVar, null), 2);
                break;
            case 19:
                ((p0g) this.receiver).getClass();
                break;
            default:
                ((Runnable) this.receiver).run();
                break;
        }
        return e5fVar;
    }
}
