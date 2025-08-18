package ru.ok.android.externcalls.sdk.stereo.hands;

import defpackage.a66;
import defpackage.bg1;
import defpackage.c66;
import defpackage.e5f;
import defpackage.k56;
import defpackage.lp1;
import defpackage.m56;
import defpackage.op1;
import defpackage.rd7;
import defpackage.vte;
import defpackage.wte;
import defpackage.x53;
import defpackage.xfg;
import defpackage.z53;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutor;
import ru.ok.android.externcalls.sdk.stereo.internal.listener.StereoRoomListenerManagerImpl;
import ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomManagerListener;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012(\u0010\n\u001a$\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\u001e\u0010\u000e\u001a\u001a\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\f\u0012\n\u0018\u00010\fj\u0004\u0018\u0001`\r0\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u0018\u001a\u00020\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\tH\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0005H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001cH\u0016¢\u0006\u0004\b'\u0010(J;\u0010)\u001a\u00020\t2\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b2\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bH\u0016¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u00020\t2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010/R6\u0010\n\u001a$\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\t0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00100R,\u0010\u000e\u001a\u001a\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\f\u0012\n\u0018\u00010\fj\u0004\u0018\u0001`\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00101R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00102R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00103R8\u00106\u001a&\u0012\b\u0012\u00060\fj\u0002`\r\u0012\u0004\u0012\u00020\u001a04j\u0012\u0012\b\u0012\u00060\fj\u0002`\r\u0012\u0004\u0012\u00020\u001a`58\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010'\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010:¨\u0006;"}, d2 = {"Lru/ok/android/externcalls/sdk/stereo/hands/StereoRoomHandsQueueImpl;", "Lru/ok/android/externcalls/sdk/stereo/hands/StereoRoomHandsQueue;", "Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor;", "commandExecutor", "Lkotlin/Function2;", "", "Lbg1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "Lkotlin/Function0;", "Le5f;", "idsResolverHelper", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "getExternalId", "Lru/ok/android/externcalls/sdk/stereo/internal/listener/StereoRoomListenerManagerImpl;", "listenersManager", "Lvte;", "timeProvider", "<init>", "(Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor;La66;Lm56;Lru/ok/android/externcalls/sdk/stereo/internal/listener/StereoRoomListenerManagerImpl;Lvte;)V", "onSuccess", "", "onError", "loadHandsQueue", "(Lk56;Lm56;)V", "Lru/ok/android/externcalls/sdk/stereo/hands/StereoHandQueueItem;", "item", "", "raised", "participantHandChanged", "(Lru/ok/android/externcalls/sdk/stereo/hands/StereoHandQueueItem;Z)V", "notifyHandsStatusChanged", "()V", "getQueue", "()Ljava/util/List;", "", "getTotalCount", "()I", "hasMore", "()Z", "loadMoreElements", "(Lm56;Lm56;)V", "Lop1;", "event", "onHandUp", "(Lop1;)V", "Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor;", "La66;", "Lm56;", "Lru/ok/android/externcalls/sdk/stereo/internal/listener/StereoRoomListenerManagerImpl;", "Lvte;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "handQueue", "Ljava/util/HashMap;", "totalCount", "I", "Z", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class StereoRoomHandsQueueImpl implements StereoRoomHandsQueue {
    private final StereoRoomCommandExecutor commandExecutor;
    private final m56 getExternalId;
    private final HashMap<ParticipantId, StereoHandQueueItem> handQueue = new HashMap<>();
    private boolean hasMore = true;
    private final a66 idsResolverHelper;
    private final StereoRoomListenerManagerImpl listenersManager;
    private final vte timeProvider;
    private int totalCount;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "totalCount", "", "hasMore", "", "Llp1;", "queue", "Le5f;", "invoke", "(IZLjava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.stereo.hands.StereoRoomHandsQueueImpl$loadHandsQueue$1, reason: invalid class name */
    public static final class AnonymousClass1 extends rd7 implements c66 {
        final /* synthetic */ k56 $onSuccess;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Le5f;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: ru.ok.android.externcalls.sdk.stereo.hands.StereoRoomHandsQueueImpl$loadHandsQueue$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends rd7 implements k56 {
            final /* synthetic */ k56 $onSuccess;
            final /* synthetic */ List<lp1> $queue;
            final /* synthetic */ StereoRoomHandsQueueImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(List<lp1> list, k56 k56Var, StereoRoomHandsQueueImpl stereoRoomHandsQueueImpl) {
                super(0);
                this.$queue = list;
                this.$onSuccess = k56Var;
                this.this$0 = stereoRoomHandsQueueImpl;
            }

            @Override // defpackage.k56
            public /* bridge */ /* synthetic */ Object invoke() {
                m115invoke();
                return e5f.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m115invoke() {
                List<lp1> list = this.$queue;
                StereoRoomHandsQueueImpl stereoRoomHandsQueueImpl = this.this$0;
                for (lp1 lp1Var : list) {
                    ParticipantId participantId = (ParticipantId) stereoRoomHandsQueueImpl.getExternalId.invoke(lp1Var.b);
                    if (participantId != null) {
                        stereoRoomHandsQueueImpl.participantHandChanged(new StereoHandQueueItem(participantId, lp1Var.a), true);
                    }
                }
                this.$onSuccess.invoke();
                this.this$0.notifyHandsStatusChanged();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(k56 k56Var) {
            super(3);
            this.$onSuccess = k56Var;
        }

        @Override // defpackage.c66
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke(((Number) obj).intValue(), ((Boolean) obj2).booleanValue(), (List<lp1>) obj3);
            return e5f.a;
        }

        public final void invoke(int i, boolean z, List<lp1> list) {
            StereoRoomHandsQueueImpl.this.totalCount = i;
            StereoRoomHandsQueueImpl.this.hasMore = z;
            a66 a66Var = StereoRoomHandsQueueImpl.this.idsResolverHelper;
            ArrayList arrayList = new ArrayList(z53.S(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((lp1) it.next()).b);
            }
            a66Var.invoke(arrayList, new AnonymousClass2(list, this.$onSuccess, StereoRoomHandsQueueImpl.this));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Le5f;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.stereo.hands.StereoRoomHandsQueueImpl$loadMoreElements$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00411 extends rd7 implements k56 {
        final /* synthetic */ m56 $onSuccess;
        final /* synthetic */ StereoRoomHandsQueueImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00411(m56 m56Var, StereoRoomHandsQueueImpl stereoRoomHandsQueueImpl) {
            super(0);
            this.$onSuccess = m56Var;
            this.this$0 = stereoRoomHandsQueueImpl;
        }

        @Override // defpackage.k56
        public /* bridge */ /* synthetic */ Object invoke() {
            m116invoke();
            return e5f.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m116invoke() {
            m56 m56Var = this.$onSuccess;
            if (m56Var != null) {
                m56Var.invoke(this.this$0);
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Le5f;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.stereo.hands.StereoRoomHandsQueueImpl$onHandUp$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00421 extends rd7 implements k56 {
        final /* synthetic */ op1 $event;
        final /* synthetic */ StereoRoomHandsQueueImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00421(op1 op1Var, StereoRoomHandsQueueImpl stereoRoomHandsQueueImpl) {
            super(0);
            this.$event = op1Var;
            this.this$0 = stereoRoomHandsQueueImpl;
        }

        @Override // defpackage.k56
        public /* bridge */ /* synthetic */ Object invoke() {
            m117invoke();
            return e5f.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m117invoke() {
            List list = this.$event.c;
            StereoRoomHandsQueueImpl stereoRoomHandsQueueImpl = this.this$0;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ParticipantId participantId = (ParticipantId) stereoRoomHandsQueueImpl.getExternalId.invoke((bg1) it.next());
                if (participantId != null) {
                    ((wte) stereoRoomHandsQueueImpl.timeProvider).getClass();
                    stereoRoomHandsQueueImpl.participantHandChanged(new StereoHandQueueItem(participantId, Clock.systemUTC().millis()), false);
                }
            }
            List list2 = this.$event.b;
            StereoRoomHandsQueueImpl stereoRoomHandsQueueImpl2 = this.this$0;
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                ParticipantId participantId2 = (ParticipantId) stereoRoomHandsQueueImpl2.getExternalId.invoke((bg1) it2.next());
                if (participantId2 != null) {
                    ((wte) stereoRoomHandsQueueImpl2.timeProvider).getClass();
                    stereoRoomHandsQueueImpl2.participantHandChanged(new StereoHandQueueItem(participantId2, Clock.systemUTC().millis()), true);
                }
            }
            this.this$0.totalCount = this.$event.a;
            this.this$0.notifyHandsStatusChanged();
        }
    }

    public StereoRoomHandsQueueImpl(StereoRoomCommandExecutor stereoRoomCommandExecutor, a66 a66Var, m56 m56Var, StereoRoomListenerManagerImpl stereoRoomListenerManagerImpl, vte vteVar) {
        this.commandExecutor = stereoRoomCommandExecutor;
        this.idsResolverHelper = a66Var;
        this.getExternalId = m56Var;
        this.listenersManager = stereoRoomListenerManagerImpl;
        this.timeProvider = vteVar;
    }

    private final void loadHandsQueue(k56 onSuccess, m56 onError) {
        this.commandExecutor.getHandsQueue(new AnonymousClass1(onSuccess), onError);
    }

    public static /* synthetic */ void loadHandsQueue$default(StereoRoomHandsQueueImpl stereoRoomHandsQueueImpl, k56 k56Var, m56 m56Var, int i, Object obj) {
        if ((i & 2) != 0) {
            m56Var = null;
        }
        stereoRoomHandsQueueImpl.loadHandsQueue(k56Var, m56Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyHandsStatusChanged() {
        this.listenersManager.onHandStatusChange(new StereoRoomManagerListener.HandStatusUpdated(this.totalCount, getQueue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void participantHandChanged(StereoHandQueueItem item, boolean raised) {
        if (raised) {
            this.handQueue.put(item.getParticipantId(), item);
        } else {
            this.handQueue.remove(item.getParticipantId());
        }
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.hands.StereoRoomHandsQueue
    public int getTotalCount() {
        return this.totalCount;
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.hands.StereoRoomHandsQueue
    /* renamed from: hasMore, reason: from getter */
    public boolean getHasMore() {
        return this.hasMore;
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.hands.StereoRoomHandsQueue
    public void loadMoreElements(m56 onSuccess, m56 onError) {
        loadHandsQueue(new C00411(onSuccess, this), onError);
    }

    public final void onHandUp(op1 event) {
        this.idsResolverHelper.invoke(x53.t0(event.b, event.c), new C00421(event, this));
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.hands.StereoRoomHandsQueue
    public List<StereoHandQueueItem> getQueue() {
        HashMap<ParticipantId, StereoHandQueueItem> map = this.handQueue;
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<ParticipantId, StereoHandQueueItem>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            StereoHandQueueItem value = it.next().getValue();
            if (value != null) {
                arrayList.add(value);
            }
        }
        return x53.x0(arrayList, new Comparator() { // from class: ru.ok.android.externcalls.sdk.stereo.hands.StereoRoomHandsQueueImpl$getQueue$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return xfg.f(Long.valueOf(((StereoHandQueueItem) t).getAddedTs()), Long.valueOf(((StereoHandQueueItem) t2).getAddedTs()));
            }
        });
    }
}
