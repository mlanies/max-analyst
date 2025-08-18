package ru.ok.android.externcalls.sdk.feedback.internal.listeners;

import android.os.Handler;
import android.os.Looper;
import androidx.work.WorkRequest;
import defpackage.a71;
import defpackage.b71;
import defpackage.bg1;
import defpackage.d63;
import defpackage.kl4;
import defpackage.r60;
import defpackage.tpa;
import defpackage.v05;
import defpackage.x53;
import defpackage.z53;
import defpackage.z61;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.feedback.ParticipantFeedback;
import ru.ok.android.externcalls.sdk.feedback.ParticipantFeedbackSource;
import ru.ok.android.externcalls.sdk.feedback.listener.FeedbackListener;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.mapping.IdMappingResolver;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;

@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001WB'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u001a\u0010\u0012J\u001d\u0010\u001b\u001a\u00020\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u001b\u0010\u0012J\u0017\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\r2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b#\u0010$J1\u0010(\u001a\b\u0012\u0004\u0012\u00020\"0\r2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0\r2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000e0&H\u0002¢\u0006\u0004\b(\u0010)J\u001d\u0010+\u001a\u00020\u00102\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b+\u0010\u0012J\u0017\u0010,\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b.\u0010\u001fJ\u001f\u00103\u001a\u00020\u00102\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u00102\u0006\u00105\u001a\u00020\u0015H\u0016¢\u0006\u0004\b6\u0010\u0018J\u0011\u00107\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b7\u00108J\r\u00109\u001a\u00020\u0010¢\u0006\u0004\b9\u0010\u0014J\u0017\u0010<\u001a\u00020\u00102\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\u00102\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b>\u0010=R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010?R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010@R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010AR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020:0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR:\u0010M\u001a&\u0012\b\u0012\u00060Jj\u0002`K\u0012\u0004\u0012\u00020\u000e0Ij\u0012\u0012\b\u0012\u00060Jj\u0002`K\u0012\u0004\u0012\u00020\u000e`L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010O\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00150Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000e0T8F¢\u0006\u0006\u001a\u0004\bU\u0010V¨\u0006X"}, d2 = {"Lru/ok/android/externcalls/sdk/feedback/internal/listeners/FeedbackListenerManagerImpl;", "Lru/ok/android/externcalls/sdk/feedback/internal/listeners/FeedbackListenerManager;", "Lb71;", "Lru/ok/android/externcalls/sdk/Conversation;", "conversation", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "store", "Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;", "idMappingResolver", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "idMappingWrapper", "<init>", "(Lru/ok/android/externcalls/sdk/Conversation;Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;)V", "", "Lru/ok/android/externcalls/sdk/feedback/ParticipantFeedback;", "newFeedback", "Le5f;", "updateActiveFeedback", "(Ljava/util/List;)V", "scheduleRemoving", "()V", "", "currentTime", "tryToRemoveOld", "(J)V", "list", "notifyFeedbackRemoved", "notifyFeedbackAdded", "", "isEnabled", "notifyFeedbackEnabledChanged", "(Z)V", "La71;", "feedback", "Lru/ok/android/externcalls/sdk/feedback/internal/listeners/FeedbackListenerManagerImpl$CallParticipantFeedback;", "unrollReceivedFeedback", "(La71;)Ljava/util/List;", "mappedFeedbacks", "", "resolvedMappings", "processFeedbackForResolvedInternalIds", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "feedbacks", "notifyResolvedFeedbackItems", "onFeedback", "(La71;)V", "onFeedbackEnabledChanged", "", "key", "Lru/ok/android/externcalls/sdk/feedback/ParticipantFeedbackSource;", "source", "ownFeedbackSent", "(Ljava/lang/String;Lru/ok/android/externcalls/sdk/feedback/ParticipantFeedbackSource;)V", "millis", "setTimeout", "getOwnCurrentFeedback", "()Lru/ok/android/externcalls/sdk/feedback/ParticipantFeedback;", "clear", "Lru/ok/android/externcalls/sdk/feedback/listener/FeedbackListener;", "listener", "addListener", "(Lru/ok/android/externcalls/sdk/feedback/listener/FeedbackListener;)V", "removeListener", "Lru/ok/android/externcalls/sdk/Conversation;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "listeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Ljava/util/HashMap;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "Lkotlin/collections/HashMap;", "activeFeedback", "Ljava/util/HashMap;", "timeout", "J", "Ljava/util/LinkedList;", "generations", "Ljava/util/LinkedList;", "", "getFeedback", "()Ljava/util/Set;", "CallParticipantFeedback", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FeedbackListenerManagerImpl implements FeedbackListenerManager, b71 {
    private final Conversation conversation;
    private final IdMappingResolver idMappingResolver;
    private final IdMappingWrapper idMappingWrapper;
    private final ParticipantStore store;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private final CopyOnWriteArraySet<FeedbackListener> listeners = new CopyOnWriteArraySet<>();
    private HashMap<ParticipantId, ParticipantFeedback> activeFeedback = new HashMap<>();
    private long timeout = WorkRequest.MIN_BACKOFF_MILLIS;
    private final LinkedList<Long> generations = new LinkedList<>();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ok/android/externcalls/sdk/feedback/internal/listeners/FeedbackListenerManagerImpl$CallParticipantFeedback;", "", "Lbg1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "participantId", "", "feedbackId", "<init>", "(Lbg1;Ljava/lang/String;)V", "Lbg1;", "getParticipantId", "()Lbg1;", "Ljava/lang/String;", "getFeedbackId", "()Ljava/lang/String;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class CallParticipantFeedback {
        private final String feedbackId;
        private final bg1 participantId;

        public CallParticipantFeedback(bg1 bg1Var, String str) {
            this.participantId = bg1Var;
            this.feedbackId = str;
        }

        public final String getFeedbackId() {
            return this.feedbackId;
        }

        public final bg1 getParticipantId() {
            return this.participantId;
        }
    }

    public FeedbackListenerManagerImpl(Conversation conversation, ParticipantStore participantStore, IdMappingResolver idMappingResolver, IdMappingWrapper idMappingWrapper) {
        this.conversation = conversation;
        this.store = participantStore;
        this.idMappingResolver = idMappingResolver;
        this.idMappingWrapper = idMappingWrapper;
    }

    private final void notifyFeedbackAdded(List<ParticipantFeedback> list) {
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((FeedbackListener) it.next()).onFeedbackAdded(list);
        }
    }

    private final void notifyFeedbackEnabledChanged(boolean isEnabled) {
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((FeedbackListener) it.next()).onFeedbackEnabledChanged(isEnabled);
        }
    }

    private final void notifyFeedbackRemoved(List<ParticipantFeedback> list) {
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((FeedbackListener) it.next()).onFeedbackRemoved(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyResolvedFeedbackItems(List<ParticipantFeedback> feedbacks) {
        if (feedbacks.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : feedbacks) {
            if (!tpa.f(this.activeFeedback.get(((ParticipantFeedback) obj).getParticipantId()) != null ? r4.getKey() : null, r3.getKey())) {
                arrayList.add(obj);
            }
        }
        updateActiveFeedback(feedbacks);
        if (!arrayList.isEmpty()) {
            notifyFeedbackAdded(arrayList);
        }
        scheduleRemoving();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFeedback$lambda$1(FeedbackListenerManagerImpl feedbackListenerManagerImpl, List list, List list2) {
        feedbackListenerManagerImpl.processFeedbackForResolvedInternalIds(list, list2);
        feedbackListenerManagerImpl.notifyResolvedFeedbackItems(list2);
    }

    private final List<CallParticipantFeedback> processFeedbackForResolvedInternalIds(List<CallParticipantFeedback> mappedFeedbacks, List<ParticipantFeedback> resolvedMappings) {
        ParticipantId byInternal;
        long jCurrentTimeMillis = System.currentTimeMillis() + this.timeout;
        ArrayList arrayList = new ArrayList();
        for (CallParticipantFeedback callParticipantFeedback : mappedFeedbacks) {
            ConversationParticipant byInternal2 = this.store.getByInternal(callParticipantFeedback.getParticipantId());
            if (byInternal2 == null || (byInternal = byInternal2.getExternalId()) == null) {
                byInternal = this.idMappingWrapper.getByInternal(callParticipantFeedback.getParticipantId());
            }
            ParticipantId participantId = byInternal;
            ParticipantFeedback participantFeedback = participantId != null ? new ParticipantFeedback(callParticipantFeedback.getFeedbackId(), jCurrentTimeMillis, participantId, null, 8, null) : null;
            if (participantFeedback != null) {
                resolvedMappings.add(participantFeedback);
            } else {
                arrayList.add(callParticipantFeedback);
            }
        }
        this.generations.add(Long.valueOf(jCurrentTimeMillis));
        return arrayList;
    }

    private final void scheduleRemoving() {
        LinkedList<Long> linkedList = this.generations;
        Long lRemove = linkedList.isEmpty() ? null : linkedList.remove(0);
        if (lRemove != null) {
            long jLongValue = lRemove.longValue();
            this.mainHandler.postDelayed(new r60(this, jLongValue, 4), jLongValue - System.currentTimeMillis());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tryToRemoveOld(long currentTime) {
        Iterator<Map.Entry<ParticipantId, ParticipantFeedback>> it = this.activeFeedback.entrySet().iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            Map.Entry<ParticipantId, ParticipantFeedback> next = it.next();
            if (next.getValue().getFinishTimeMs() <= currentTime) {
                it.remove();
                arrayList.add(next.getValue());
            }
        }
        if (!arrayList.isEmpty()) {
            notifyFeedbackRemoved(arrayList);
        }
        scheduleRemoving();
    }

    private final List<CallParticipantFeedback> unrollReceivedFeedback(a71 feedback) {
        List<z61> list = feedback.b;
        ArrayList arrayList = new ArrayList();
        for (z61 z61Var : list) {
            List list2 = z61Var.b;
            ArrayList arrayList2 = new ArrayList(z53.S(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(new CallParticipantFeedback((bg1) it.next(), z61Var.a));
            }
            d63.V(arrayList2, arrayList);
        }
        return arrayList;
    }

    private final void updateActiveFeedback(List<ParticipantFeedback> newFeedback) {
        for (ParticipantFeedback participantFeedback : newFeedback) {
            this.activeFeedback.put(participantFeedback.getParticipantId(), participantFeedback);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManager
    public void addListener(FeedbackListener listener) {
        this.listeners.add(listener);
    }

    public final void clear() {
        this.activeFeedback = new HashMap<>();
    }

    public final Set<ParticipantFeedback> getFeedback() {
        return x53.H0(this.activeFeedback.values());
    }

    @Override // ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManager
    public ParticipantFeedback getOwnCurrentFeedback() {
        return this.activeFeedback.get(this.conversation.getMe().getExternalId());
    }

    @Override // defpackage.b71
    public void onFeedback(a71 feedback) {
        if (tpa.f(feedback.a, this.store.getActiveRoomId())) {
            List<CallParticipantFeedback> listUnrollReceivedFeedback = unrollReceivedFeedback(feedback);
            if (listUnrollReceivedFeedback.isEmpty()) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            List<CallParticipantFeedback> listProcessFeedbackForResolvedInternalIds = processFeedbackForResolvedInternalIds(listUnrollReceivedFeedback, arrayList);
            if (listProcessFeedbackForResolvedInternalIds.isEmpty()) {
                notifyResolvedFeedbackItems(arrayList);
                return;
            }
            IdMappingResolver idMappingResolver = this.idMappingResolver;
            ArrayList arrayList2 = new ArrayList(z53.S(listProcessFeedbackForResolvedInternalIds, 10));
            Iterator<T> it = listProcessFeedbackForResolvedInternalIds.iterator();
            while (it.hasNext()) {
                arrayList2.add(((CallParticipantFeedback) it.next()).getParticipantId());
            }
            idMappingResolver.resolveExternalsByInternalsIds(arrayList2, new v05(this, listProcessFeedbackForResolvedInternalIds, arrayList, 3), new kl4(this, 24, arrayList));
        }
    }

    public final void onFeedbackEnabledChanged(boolean isEnabled) {
        notifyFeedbackEnabledChanged(isEnabled);
    }

    @Override // ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManager
    public void ownFeedbackSent(String key, ParticipantFeedbackSource source) {
        ConversationParticipant me2 = this.conversation.getMe();
        if (me2 == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() + this.timeout;
        ParticipantFeedback participantFeedback = new ParticipantFeedback(key, jCurrentTimeMillis, me2.getExternalId(), source);
        this.generations.add(Long.valueOf(jCurrentTimeMillis));
        updateActiveFeedback(Collections.singletonList(participantFeedback));
        notifyFeedbackAdded(Collections.singletonList(participantFeedback));
        scheduleRemoving();
    }

    @Override // ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManager
    public void removeListener(FeedbackListener listener) {
        this.listeners.remove(listener);
    }

    @Override // ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManager
    public void setTimeout(long millis) {
        this.timeout = millis;
    }
}
