package ru.ok.android.externcalls.sdk.waiting_room;

import defpackage.a4c;
import defpackage.b66;
import defpackage.bg1;
import defpackage.bq1;
import defpackage.ce;
import defpackage.cq1;
import defpackage.e0a;
import defpackage.f46;
import defpackage.gsa;
import defpackage.hc3;
import defpackage.hy0;
import defpackage.hz9;
import defpackage.iqd;
import defpackage.jy0;
import defpackage.ka6;
import defpackage.kp1;
import defpackage.lp1;
import defpackage.m56;
import defpackage.mp1;
import defpackage.muc;
import defpackage.np1;
import defpackage.nqd;
import defpackage.nrf;
import defpackage.oj3;
import defpackage.op1;
import defpackage.pp1;
import defpackage.py0;
import defpackage.q1a;
import defpackage.qj3;
import defpackage.rod;
import defpackage.sqd;
import defpackage.t66;
import defpackage.tef;
import defpackage.wg0;
import defpackage.xpb;
import defpackage.ypc;
import defpackage.ztc;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.id.CallExternalIdConverter;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.mapping.IdMappingResolver;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants;

@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 b2\u00020\u0001:\u0003bcdB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0014J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000eH\u0007¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u000eH\u0002¢\u0006\u0004\b(\u0010'J\u000f\u0010)\u001a\u00020\u000eH\u0003¢\u0006\u0004\b)\u0010'J\u000f\u0010+\u001a\u00020*H\u0003¢\u0006\u0004\b+\u0010,J!\u00102\u001a\f\u0012\b\u0012\u000600j\u0002`10/2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b2\u00103J'\u00107\u001a\b\u0012\u0004\u0012\u0002060/2\u0006\u0010\r\u001a\u00020\f2\b\u00105\u001a\u0004\u0018\u000104H\u0002¢\u0006\u0004\b7\u00108J#\u0010;\u001a\u0002042\u0006\u00109\u001a\u00020-2\n\u0010:\u001a\u000600j\u0002`1H\u0002¢\u0006\u0004\b;\u0010<JP\u0010D\u001a\u00020\u000e2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0=2\u001a\b\u0004\u0010A\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0=\u0012\u0004\u0012\u00020\u000e0@2\u0014\b\u0004\u0010C\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u000e0@H\u0082\b¢\u0006\u0004\bD\u0010EJ#\u0010F\u001a\b\u0012\u0004\u0012\u00020-0=2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0=H\u0002¢\u0006\u0004\bF\u0010GJ'\u0010H\u001a\f\u0012\b\u0012\u000600j\u0002`10=2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0=H\u0002¢\u0006\u0004\bH\u0010GJ\u001d\u0010I\u001a\u00020\u000e2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0=H\u0002¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u000eH\u0002¢\u0006\u0004\bK\u0010'J\u0017\u0010M\u001a\u00020\u000e2\u0006\u0010L\u001a\u00020*H\u0003¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020\u0011H\u0002¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\u000eH\u0003¢\u0006\u0004\bQ\u0010'J\u0017\u0010R\u001a\u00020\u000e2\u0006\u0010L\u001a\u00020*H\u0003¢\u0006\u0004\bR\u0010NR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010SR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010TR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010UR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010VR\"\u0010Y\u001a\u0010\u0012\f\u0012\n X*\u0004\u0018\u00010\u00110\u00110W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\\\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010^R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010_R\u0016\u0010\u0015\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010_R\u001e\u0010`\u001a\n X*\u0004\u0018\u00010*0*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010a¨\u0006e"}, d2 = {"Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipants;", "Lbq1;", "Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipants$Listener;", "listener", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "idMappingWrapper", "Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;", "idMappingResolver", "La4c;", "log", "<init>", "(Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipants$Listener;Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;La4c;)V", "Lpy0;", "call", "Le5f;", "setCall", "(Lpy0;)V", "", "isMeAdmin", "onIsMeAdminMayHaveChanged", "(Z)V", "isWaitingRoomEnabled", "onWaitingRoomEnabled", "isMeInWaitingRoom", "onMeInWaitingRoomChanged", "Lmp1;", "event", "onAttendee", "(Lmp1;)V", "Lnp1;", "onFeedback", "(Lnp1;)V", "Lpp1;", "onPromotionUpdated", "(Lpp1;)V", "Lop1;", "onHandUp", "(Lop1;)V", "release", "()V", "update", "onWaitingRoomParticipantsMayHaveChanged", "Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipantsUpdate;", "loadWaitingParticipantIds", "()Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipantsUpdate;", "Lru/ok/android/externcalls/sdk/waiting_room/ConversationWaitingParticipantId;", "waitingParticipantId", "Liqd;", "Lbg1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "resolveInternalIdSingle", "(Lru/ok/android/externcalls/sdk/waiting_room/ConversationWaitingParticipantId;)Liqd;", "Llp1;", "fromId", "Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipants$WaitingParticipantsPage;", "loadWaitingParticipantIdsPageSingle", "(Lpy0;Llp1;)Liqd;", "participantId", "internalId", "fromInternalLong", "(Lru/ok/android/externcalls/sdk/waiting_room/ConversationWaitingParticipantId;Lbg1;)Llp1;", "", "Lkp1;", "waitingParticipants", "Lkotlin/Function1;", "onResult", "", "onError", "resolveInternalIds", "(Ljava/util/List;Lm56;Lm56;)V", "getResolvedWaitingParticipantIds", "(Ljava/util/List;)Ljava/util/List;", "getInternalIdsToResolve", "putIdMappingsToCache", "(Ljava/util/List;)V", "scheduleLoad", "data", "notifyListener", "(Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipantsUpdate;)V", "shouldSendWaitingList", "()Z", "notifyListenerWithEmptyList", "notifyIfListChanged", "Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipants$Listener;", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;", "La4c;", "Lxpb;", "kotlin.jvm.PlatformType", "loadEventSubject", "Lxpb;", "Lhc3;", "compositeDisposable", "Lhc3;", "Lpy0;", "Z", "lastSentParticipantIds", "Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipantsUpdate;", "Companion", "Listener", "WaitingParticipantsPage", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class WaitingRoomParticipants implements bq1 {
    private static final String LOG_TAG = "WaitingRoomParticipants";
    private static final int PAGE_SIZE = 50;
    private volatile py0 call;
    private final hc3 compositeDisposable;
    private final IdMappingResolver idMappingResolver;
    private final IdMappingWrapper idMappingWrapper;
    private volatile boolean isMeAdmin;
    private volatile boolean isWaitingRoomEnabled;
    private volatile WaitingRoomParticipantsUpdate lastSentParticipantIds;
    private final Listener listener;
    private final xpb loadEventSubject;
    private final a4c log;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipants$Listener;", "", "Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipantsUpdate;", "data", "Le5f;", "onWaitingRoomParticipantsChanged", "(Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipantsUpdate;)V", "", "isMeInWaitingRoom", "onMeInWaitingRoomChanged", "(Z)V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public interface Listener {
        void onMeInWaitingRoomChanged(boolean isMeInWaitingRoom);

        void onWaitingRoomParticipantsChanged(WaitingRoomParticipantsUpdate data);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipants$WaitingParticipantsPage;", "", "participantIds", "", "Lru/ok/android/externcalls/sdk/waiting_room/ConversationWaitingParticipantId;", "hasMore", "", "(Ljava/util/List;Z)V", "getHasMore", "()Z", "setHasMore", "(Z)V", "getParticipantIds", "()Ljava/util/List;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class WaitingParticipantsPage {
        private boolean hasMore;
        private final List<ConversationWaitingParticipantId> participantIds;

        public WaitingParticipantsPage(List<ConversationWaitingParticipantId> list, boolean z) {
            this.participantIds = list;
            this.hasMore = z;
        }

        public final boolean getHasMore() {
            return this.hasMore;
        }

        public final List<ConversationWaitingParticipantId> getParticipantIds() {
            return this.participantIds;
        }

        public final void setHasMore(boolean z) {
            this.hasMore = z;
        }
    }

    public WaitingRoomParticipants(Listener listener, IdMappingWrapper idMappingWrapper, IdMappingResolver idMappingResolver, a4c a4cVar) {
        this.listener = listener;
        this.idMappingWrapper = idMappingWrapper;
        this.idMappingResolver = idMappingResolver;
        this.log = a4cVar;
        xpb xpbVar = new xpb();
        this.loadEventSubject = xpbVar;
        hc3 hc3Var = new hc3();
        this.compositeDisposable = hc3Var;
        WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate = WaitingRoomParticipantsUpdate.EMPTY;
        this.lastSentParticipantIds = waitingRoomParticipantsUpdate;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ztc ztcVarA = muc.a();
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(ztcVarA, "scheduler is null");
        e0a e0aVar = new e0a(new hz9(xpbVar, timeUnit, ztcVarA, 1).n(muc.b()), new b66() { // from class: ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants$loadDisposable$1
            @Override // defpackage.b66
            /* renamed from: apply, reason: merged with bridge method [inline-methods] */
            public final WaitingRoomParticipantsUpdate mo131apply(Boolean bool) {
                return this.this$0.loadWaitingParticipantIds();
            }
        }, 3);
        Objects.requireNonNull(waitingRoomParticipantsUpdate, "item is null");
        hc3Var.a(new e0a(e0aVar, new t66(waitingRoomParticipantsUpdate), 5).n(ce.a()).p(new qj3() { // from class: ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants$loadDisposable$2
            @Override // defpackage.qj3
            public final void accept(WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate2) {
                this.this$0.notifyListener(waitingRoomParticipantsUpdate2);
            }
        }));
    }

    private final lp1 fromInternalLong(ConversationWaitingParticipantId participantId, bg1 internalId) {
        return new lp1(internalId, participantId.addedTs);
    }

    private final List<bg1> getInternalIdsToResolve(List<kp1> waitingParticipants) {
        ArrayList arrayList = new ArrayList(waitingParticipants.size());
        Iterator<kp1> it = waitingParticipants.iterator();
        while (it.hasNext()) {
            lp1 lp1Var = it.next().a;
            IdMappingWrapper idMappingWrapper = this.idMappingWrapper;
            bg1 bg1Var = lp1Var.b;
            if (idMappingWrapper.getByInternal(bg1Var) == null) {
                arrayList.add(bg1Var);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ConversationWaitingParticipantId> getResolvedWaitingParticipantIds(List<kp1> waitingParticipants) {
        ArrayList arrayList = new ArrayList(waitingParticipants.size());
        for (kp1 kp1Var : waitingParticipants) {
            ParticipantId byInternal = this.idMappingWrapper.getByInternal(kp1Var.a.b);
            if (byInternal != null) {
                arrayList.add(new ConversationWaitingParticipantId(ParticipantId.withoutDeviceId(byInternal.id, byInternal.isAnon), kp1Var.a.a));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WaitingRoomParticipantsUpdate loadWaitingParticipantIds() {
        lp1 lp1VarFromInternalLong;
        boolean z;
        py0 py0Var = this.call;
        if (py0Var == null || !this.isMeAdmin || !this.isWaitingRoomEnabled) {
            return WaitingRoomParticipantsUpdate.EMPTY;
        }
        ArrayList arrayList = new ArrayList();
        ConversationWaitingParticipantId conversationWaitingParticipantId = null;
        do {
            if (conversationWaitingParticipantId != null) {
                try {
                    lp1VarFromInternalLong = fromInternalLong(conversationWaitingParticipantId, (bg1) resolveInternalIdSingle(conversationWaitingParticipantId).e());
                } catch (Throwable th) {
                    this.log.log(LOG_TAG, "can't resolve internal id for " + conversationWaitingParticipantId + ". Error: " + th.getMessage());
                }
            } else {
                lp1VarFromInternalLong = null;
            }
            try {
                WaitingParticipantsPage waitingParticipantsPage = (WaitingParticipantsPage) loadWaitingParticipantIdsPageSingle(py0Var, lp1VarFromInternalLong).e();
                Iterator<ConversationWaitingParticipantId> it = waitingParticipantsPage.getParticipantIds().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getParticipantId());
                }
                z = waitingParticipantsPage.getHasMore() && (waitingParticipantsPage.getParticipantIds().isEmpty() ^ true);
                if (!waitingParticipantsPage.getParticipantIds().isEmpty()) {
                    conversationWaitingParticipantId = waitingParticipantsPage.getParticipantIds().get(waitingParticipantsPage.getParticipantIds().size() - 1);
                }
            } catch (Throwable th2) {
                this.log.log(LOG_TAG, "can't load next page. Error: " + th2.getMessage());
            }
        } while (z);
        HashSet hashSet = new HashSet(this.lastSentParticipantIds.participantsIds);
        HashSet hashSet2 = new HashSet(arrayList);
        hashSet.removeAll(arrayList);
        hashSet2.removeAll(this.lastSentParticipantIds.participantsIds);
        this.lastSentParticipantIds = new WaitingRoomParticipantsUpdate(arrayList, !hashSet2.isEmpty(), !hashSet.isEmpty());
        return this.lastSentParticipantIds;
    }

    private final iqd loadWaitingParticipantIdsPageSingle(py0 call, lp1 fromId) {
        return new q1a(1, new tef(call, fromId, this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadWaitingParticipantIdsPageSingle$lambda$6(py0 py0Var, lp1 lp1Var, WaitingRoomParticipants waitingRoomParticipants, sqd sqdVar) {
        gsa gsaVar = new gsa(waitingRoomParticipants, 6, sqdVar);
        nrf nrfVar = new nrf(sqdVar, 0);
        rod rodVar = py0Var.Z;
        try {
            ka6 ka6VarB = f46.b(null, "get-waiting-hall");
            JSONObject jSONObject = ka6VarB.a;
            jSONObject.put("backward", false);
            if (lp1Var != null) {
                jSONObject.put("fromId", new JSONObject().put("id", lp1Var.b.c()).put("addedTs", lp1Var.a));
            }
            ka6VarB.b(PAGE_SIZE, NewHtcHomeBadger.COUNT);
            rodVar.d(ka6VarB, false, new hy0(py0Var, gsaVar, nrfVar, 0), new jy0(0, nrfVar));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadWaitingParticipantIdsPageSingle$lambda$6$lambda$4(final WaitingRoomParticipants waitingRoomParticipants, final sqd sqdVar, final cq1 cq1Var) {
        final List<kp1> list = cq1Var.a;
        waitingRoomParticipants.putIdMappingsToCache(list);
        List<bg1> internalIdsToResolve = waitingRoomParticipants.getInternalIdsToResolve(list);
        if (!internalIdsToResolve.isEmpty()) {
            waitingRoomParticipants.idMappingResolver.resolveExternalsByInternalsIds(internalIdsToResolve, new Runnable() { // from class: ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants$loadWaitingParticipantIdsPageSingle$lambda$6$lambda$4$$inlined$resolveInternalIds$1
                @Override // java.lang.Runnable
                public final void run() {
                    List resolvedWaitingParticipantIds = this.this$0.getResolvedWaitingParticipantIds(list);
                    try {
                        ((nqd) sqdVar).a(new WaitingRoomParticipants.WaitingParticipantsPage(resolvedWaitingParticipantIds, cq1Var.b));
                    } catch (Exception e) {
                        ((nqd) sqdVar).d(new RuntimeException(wg0.i("Can't resolve internal ids: ", e.getMessage())));
                    }
                }
            }, new Runnable() { // from class: ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants$loadWaitingParticipantIdsPageSingle$lambda$6$lambda$4$$inlined$resolveInternalIds$2
                @Override // java.lang.Runnable
                public final void run() {
                    RuntimeException runtimeException = new RuntimeException("Can't resolve extenral ids");
                    ((nqd) sqdVar).d(new RuntimeException(wg0.i("Can't resolve internal ids: ", runtimeException.getMessage())));
                }
            });
        } else {
            ((nqd) sqdVar).a(new WaitingParticipantsPage(waitingRoomParticipants.getResolvedWaitingParticipantIds(list), cq1Var.b));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadWaitingParticipantIdsPageSingle$lambda$6$lambda$5(sqd sqdVar) {
        ((nqd) sqdVar).d(new RuntimeException("Can't get waiting room partiicpants"));
    }

    private final void notifyIfListChanged(WaitingRoomParticipantsUpdate data) {
        this.listener.onWaitingRoomParticipantsChanged(data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyListener(WaitingRoomParticipantsUpdate data) {
        if (shouldSendWaitingList()) {
            notifyIfListChanged(data);
        } else {
            notifyListenerWithEmptyList();
        }
    }

    private final void notifyListenerWithEmptyList() {
        this.lastSentParticipantIds = WaitingRoomParticipantsUpdate.EMPTY;
        notifyIfListChanged(this.lastSentParticipantIds);
    }

    private final void onWaitingRoomParticipantsMayHaveChanged() {
        if (shouldSendWaitingList()) {
            scheduleLoad();
        }
    }

    private final void putIdMappingsToCache(List<kp1> waitingParticipants) {
        for (kp1 kp1Var : waitingParticipants) {
            ParticipantId participantIdConvert = CallExternalIdConverter.convert(kp1Var.b);
            if (participantIdConvert != null) {
                this.idMappingWrapper.addMapping(participantIdConvert, kp1Var.a.b);
            }
        }
    }

    private final iqd resolveInternalIdSingle(ConversationWaitingParticipantId waitingParticipantId) {
        return new q1a(1, new ypc(this, 28, waitingParticipantId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resolveInternalIdSingle$lambda$1(WaitingRoomParticipants waitingRoomParticipants, ConversationWaitingParticipantId conversationWaitingParticipantId, sqd sqdVar) {
        waitingRoomParticipants.idMappingResolver.withInternalId(conversationWaitingParticipantId.getParticipantId(), new oj3(5, sqdVar), new nrf(sqdVar, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resolveInternalIdSingle$lambda$1$lambda$0(sqd sqdVar) {
        ((nqd) sqdVar).onError(new RuntimeException());
    }

    private final void resolveInternalIds(final List<kp1> waitingParticipants, final m56 onResult, final m56 onError) {
        putIdMappingsToCache(waitingParticipants);
        List<bg1> internalIdsToResolve = getInternalIdsToResolve(waitingParticipants);
        if (!internalIdsToResolve.isEmpty()) {
            this.idMappingResolver.resolveExternalsByInternalsIds(internalIdsToResolve, new Runnable() { // from class: ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants.resolveInternalIds.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        onResult.invoke(WaitingRoomParticipants.this.getResolvedWaitingParticipantIds(waitingParticipants));
                    } catch (Exception e) {
                        onError.invoke(e);
                    }
                }
            }, new Runnable() { // from class: ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants.resolveInternalIds.2
                @Override // java.lang.Runnable
                public final void run() {
                    onError.invoke(new RuntimeException("Can't resolve extenral ids"));
                }
            });
        } else {
            onResult.invoke(getResolvedWaitingParticipantIds(waitingParticipants));
        }
    }

    private final void scheduleLoad() {
        this.loadEventSubject.e(Boolean.TRUE);
    }

    private final boolean shouldSendWaitingList() {
        return this.isMeAdmin && this.isWaitingRoomEnabled;
    }

    private final void update() {
        if (shouldSendWaitingList()) {
            scheduleLoad();
        } else {
            notifyListenerWithEmptyList();
        }
    }

    @Override // defpackage.bq1
    public void onAttendee(mp1 event) {
        onWaitingRoomParticipantsMayHaveChanged();
    }

    @Override // defpackage.bq1
    public void onFeedback(np1 event) {
    }

    @Override // defpackage.bq1
    public void onHandUp(op1 event) {
    }

    public final void onIsMeAdminMayHaveChanged(boolean isMeAdmin) {
        if (this.isMeAdmin != isMeAdmin) {
            this.isMeAdmin = isMeAdmin;
            update();
        }
    }

    @Override // defpackage.bq1
    public void onMeInWaitingRoomChanged(boolean isMeInWaitingRoom) {
        this.listener.onMeInWaitingRoomChanged(isMeInWaitingRoom);
    }

    @Override // defpackage.bq1
    public void onPromotionUpdated(pp1 event) {
    }

    public final void onWaitingRoomEnabled(boolean isWaitingRoomEnabled) {
        if (this.isWaitingRoomEnabled != isWaitingRoomEnabled) {
            this.isWaitingRoomEnabled = isWaitingRoomEnabled;
            update();
        }
    }

    public final void release() {
        this.compositeDisposable.g();
    }

    public final void setCall(py0 call) {
        this.call = call;
    }
}
