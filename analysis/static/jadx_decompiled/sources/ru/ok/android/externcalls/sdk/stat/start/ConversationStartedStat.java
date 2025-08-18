package ru.ok.android.externcalls.sdk.stat.start;

import android.os.SystemClock;
import defpackage.k56;
import defpackage.m61;
import defpackage.n61;
import defpackage.vte;
import defpackage.w9e;
import defpackage.wte;
import defpackage.y53;
import defpackage.z53;
import defpackage.z84;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.externcalls.sdk.Conversation;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB'\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\rR\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/start/ConversationStartedStat;", "", "Lkotlin/Function0;", "Lm61;", "getEventualStatSender", "Lru/ok/android/externcalls/sdk/Conversation$CallType;", "callType", "Lvte;", "timeProvider", "<init>", "(Lk56;Lru/ok/android/externcalls/sdk/Conversation$CallType;Lvte;)V", "Le5f;", "report", "()V", "", "asString", "(Lru/ok/android/externcalls/sdk/Conversation$CallType;)Ljava/lang/String;", "getWarmupStatusString", "()Ljava/lang/String;", "onConversationStarted", "Lk56;", "Lru/ok/android/externcalls/sdk/Conversation$CallType;", "Lvte;", "", "isReported", "Z", "", "startTimeMs", "J", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ConversationStartedStat {

    @Deprecated
    public static final String CALL_TYPE_INCOMING = "incoming";

    @Deprecated
    public static final String CALL_TYPE_JOIN = "join";

    @Deprecated
    public static final String CALL_TYPE_OUTGOING = "outgoing";
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String STATUS_FINISHED = "warmup_finished";

    @Deprecated
    public static final String STATUS_IN_PROGRESS = "warmup_inprogress";

    @Deprecated
    public static final String STATUS_STARTED = "warmup_start";
    private final Conversation.CallType callType;
    private final k56 getEventualStatSender;
    private boolean isReported;
    private final long startTimeMs = SystemClock.elapsedRealtime();
    private final vte timeProvider;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/start/ConversationStartedStat$Companion;", "", "()V", "CALL_TYPE_INCOMING", "", "CALL_TYPE_JOIN", "CALL_TYPE_OUTGOING", "STATUS_FINISHED", "STATUS_IN_PROGRESS", "STATUS_STARTED", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(z84 z84Var) {
            this();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Conversation.CallType.values().length];
            try {
                iArr[Conversation.CallType.Incoming.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Conversation.CallType.Outgoing.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Conversation.CallType.Join.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ConversationStartedStat(k56 k56Var, Conversation.CallType callType, vte vteVar) {
        this.getEventualStatSender = k56Var;
        this.callType = callType;
        this.timeProvider = vteVar;
    }

    private final String asString(Conversation.CallType callType) {
        int i = WhenMappings.$EnumSwitchMapping$0[callType.ordinal()];
        if (i == 1) {
            return CALL_TYPE_INCOMING;
        }
        if (i == 2) {
            return CALL_TYPE_OUTGOING;
        }
        if (i == 3) {
            return CALL_TYPE_JOIN;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final String getWarmupStatusString() {
        return STATUS_STARTED;
    }

    private final void report() {
        ((wte) this.timeProvider).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.startTimeMs;
        m61 m61Var = (m61) this.getEventualStatSender.invoke();
        if (m61Var != null) {
            EventItemValue eventItemValue = EventItemValueKt.toEventItemValue(jElapsedRealtime);
            EventItemsMap eventItemsMap = new EventItemsMap();
            List listM = y53.M(asString(this.callType), getWarmupStatusString());
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM) {
                if (!w9e.C0((String) obj)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(z53.S(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(EventItemValue.StringValue.m69boximpl(EventItemValue.StringValue.m70constructorimpl((String) it.next())));
            }
            if (!arrayList2.isEmpty()) {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    jSONArray.put(it2.next());
                }
                eventItemsMap.set("string_value", jSONObject.put("labels", jSONArray).toString());
            }
            ((n61) m61Var).c("call_start", eventItemValue, eventItemsMap);
        }
    }

    public final void onConversationStarted() {
        if (this.isReported) {
            return;
        }
        this.isReported = true;
        report();
    }
}
