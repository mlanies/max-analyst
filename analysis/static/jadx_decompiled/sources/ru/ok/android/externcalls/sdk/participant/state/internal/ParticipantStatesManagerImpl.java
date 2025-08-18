package ru.ok.android.externcalls.sdk.participant.state.internal;

import android.os.Handler;
import defpackage.bg1;
import defpackage.cg1;
import defpackage.dg1;
import defpackage.hy0;
import defpackage.k56;
import defpackage.kpa;
import defpackage.m56;
import defpackage.mt;
import defpackage.mz7;
import defpackage.nt;
import defpackage.qod;
import defpackage.tpa;
import defpackage.u1;
import defpackage.u25;
import defpackage.v25;
import defpackage.wz4;
import defpackage.x1;
import defpackage.x53;
import defpackage.yad;
import defpackage.z53;
import defpackage.z84;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;

@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b%\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 r2\u00020\u0001:\u0003rstB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0012\u001a\u00020\u00112\n\u0010\u000e\u001a\u00060\fj\u0002`\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0017\u001a\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0017\u0010\u0018J;\u0010 \u001a\u00020\u00112\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00192\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001dH\u0007¢\u0006\u0004\b \u0010!J5\u0010%\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020#2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b%\u0010&J7\u0010(\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001dH\u0007¢\u0006\u0004\b(\u0010)J;\u0010(\u001a\u00020\u00112\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020*0\u00192\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001dH\u0007¢\u0006\u0004\b(\u0010!J\u0015\u0010,\u001a\u00020+2\u0006\u0010\"\u001a\u00020\u001a¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020.H\u0016¢\u0006\u0004\b1\u00100J\u0017\u00102\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020.H\u0016¢\u0006\u0004\b2\u00100J\u0017\u00103\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020.H\u0016¢\u0006\u0004\b3\u00100J\u000f\u00104\u001a\u00020+H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\u00112\u0006\u00106\u001a\u00020+H\u0016¢\u0006\u0004\b7\u00108J\u001b\u0010;\u001a\u00020\u00112\n\u0010\u000e\u001a\u000609j\u0002`:H\u0016¢\u0006\u0004\b;\u0010<J5\u0010B\u001a\u00020\u00112\u000e\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010=2\u0014\u0010A\u001a\u0010\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u0011\u0018\u00010?H\u0016¢\u0006\u0004\bB\u0010CJ\u000f\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bE\u0010FJ\u0019\u0010H\u001a\f\u0012\b\u0012\u000609j\u0002`:0GH\u0016¢\u0006\u0004\bH\u0010IJ\u001b\u0010J\u001a\u00020D2\n\u0010\u000e\u001a\u000609j\u0002`:H\u0016¢\u0006\u0004\bJ\u0010KJ\u001b\u0010L\u001a\u00020+2\n\u0010\u000e\u001a\u000609j\u0002`:H\u0016¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020+H\u0016¢\u0006\u0004\bN\u00105J\u0017\u0010P\u001a\u00020\u00112\u0006\u0010O\u001a\u00020+H\u0016¢\u0006\u0004\bP\u00108J\u000f\u0010Q\u001a\u00020DH\u0016¢\u0006\u0004\bQ\u0010FJ\u001b\u0010N\u001a\u00020+2\n\u0010\u000e\u001a\u000609j\u0002`:H\u0016¢\u0006\u0004\bN\u0010MJ\u001b\u0010Q\u001a\u00020D2\n\u0010\u000e\u001a\u000609j\u0002`:H\u0016¢\u0006\u0004\bQ\u0010KJ\u0019\u0010R\u001a\f\u0012\b\u0012\u000609j\u0002`:0GH\u0016¢\u0006\u0004\bR\u0010IJ\u0017\u0010S\u001a\u00020\u00112\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\bS\u0010TJ\r\u0010U\u001a\u00020\u0011¢\u0006\u0004\bU\u0010VJ#\u0010W\u001a\u00020+2\n\u0010\u000e\u001a\u000609j\u0002`:2\u0006\u0010\"\u001a\u00020\u001aH\u0002¢\u0006\u0004\bW\u0010XJ\u0017\u0010Y\u001a\u00020D2\u0006\u0010\"\u001a\u00020\u001aH\u0002¢\u0006\u0004\bY\u0010ZJ#\u0010[\u001a\u00020D2\n\u0010\u000e\u001a\u000609j\u0002`:2\u0006\u0010\"\u001a\u00020\u001aH\u0002¢\u0006\u0004\b[\u0010\\J\u001f\u0010]\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020.H\u0002¢\u0006\u0004\b]\u0010^J;\u0010`\u001a\u00020\u00112\u0012\u0010_\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020*0\u00192\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b`\u0010!J#\u0010`\u001a\u00020\u00112\u0012\u0010_\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020*0\u0019H\u0002¢\u0006\u0004\b`\u0010aJ\u0017\u0010c\u001a\u00020\u001b2\u0006\u0010b\u001a\u00020+H\u0002¢\u0006\u0004\bc\u0010dJ\u001f\u0010e\u001a\n\u0018\u000109j\u0004\u0018\u0001`:*\u00060\fj\u0002`\rH\u0002¢\u0006\u0004\be\u0010fJ\u001f\u0010g\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r*\u000609j\u0002`:H\u0002¢\u0006\u0004\bg\u0010hR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010iR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010jR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010kR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010lR0\u0010n\u001a\u001e\u0012\u0004\u0012\u00020\u001a\u0012\u0014\u0012\u0012\u0012\b\u0012\u00060\fj\u0002`\r\u0012\u0004\u0012\u00020D0m0m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR \u0010q\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020p0m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010o¨\u0006u"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl;", "Lru/ok/android/externcalls/sdk/participant/state/ParticipantStatesManager;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "store", "Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStateChanger;", "participantStateChanger", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "stateListener", "Landroid/os/Handler;", "mainThreadHandler", "<init>", "(Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStateChanger;Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;Landroid/os/Handler;)V", "Lbg1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "participantId", "Ldg1;", "newState", "Le5f;", "onStateChanged", "(Lbg1;Ldg1;)V", "", "Lru/ok/android/externcalls/sdk/ConversationParticipant;", "participants", "onParticipantsRemoved", "(Ljava/util/List;)V", "", "Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl$State;", "Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl$StateValue;", "states", "Lqod;", "listener", "errorListener", "updateMyStates", "(Ljava/util/Map;Lqod;Lqod;)V", "state", "Lyad;", "roomId", "resetStates", "(Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl$State;Lyad;Lqod;Lqod;)V", "isOn", "updateOwnState", "(Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl$State;Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl$StateValue;Lqod;Lqod;)V", "", "", "isOwnStateOn", "(Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl$State;)Z", "Lru/ok/android/externcalls/sdk/participant/state/ParticipantStatesManager$Listener;", "addAssistanceRequestListener", "(Lru/ok/android/externcalls/sdk/participant/state/ParticipantStatesManager$Listener;)V", "removeAssistanceRequestListener", "addHandListener", "removeHandListener", "isOwnHandRaised", "()Z", "isRaised", "setOwnHandRaised", "(Z)V", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "lowerHandParticipant", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)V", "Lkotlin/Function0;", "onSuccess", "Lkotlin/Function1;", "", "onError", "lowerHandForAll", "(Lk56;Lm56;)V", "", "getOwnHandRaiseTime", "()J", "", "getRaisedHandIds", "()Ljava/util/Set;", "getHandRaiseTime", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)J", "isHandRaised", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)Z", "isAssistanceRequested", "isRequested", "setAssistanceRequested", "getAssistanceRequestTime", "getAssistanceRequestIds", "resetAssistanceRequests", "(Lyad;)V", "release", "()V", "isParticipantStateOn", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl$State;)Z", "getOwnStateSetupTime", "(Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl$State;)J", "getStateSetupTime", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl$State;)J", "notifyCurrentState", "(Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl$State;Lru/ok/android/externcalls/sdk/participant/state/ParticipantStatesManager$Listener;)V", "updates", "updateOwnStateInternal", "(Ljava/util/Map;)V", "flag", "mapBooleanFlagToStateValue", "(Z)Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl$StateValue;", "toExternal", "(Lbg1;)Lru/ok/android/externcalls/sdk/id/ParticipantId;", "toInternal", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)Lbg1;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStateChanger;", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "Landroid/os/Handler;", "", "statesMap", "Ljava/util/Map;", "Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesListenerProxy;", "listenersMap", "Companion", "State", "StateValue", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ParticipantStatesManagerImpl implements ParticipantStatesManager {
    private static final String INTERNAL_STATE_OFF = "0";
    private static final String INTERNAL_STATE_ON = "1";
    private final Handler mainThreadHandler;
    private final ParticipantStateChanger participantStateChanger;
    private final ConversationEventsListener stateListener;
    private final ParticipantStore store;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final StateValue STATE_ON = StateValue.ON;
    private static final StateValue STATE_OFF = StateValue.OFF;
    private final Map<State, Map<bg1, Long>> statesMap = new LinkedHashMap();
    private final Map<State, ParticipantStatesListenerProxy> listenersMap = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl$Companion;", "", "()V", "INTERNAL_STATE_OFF", "", "INTERNAL_STATE_ON", "STATE_OFF", "Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl$StateValue;", "getSTATE_OFF", "()Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl$StateValue;", "STATE_ON", "getSTATE_ON", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final StateValue getSTATE_OFF() {
            return ParticipantStatesManagerImpl.STATE_OFF;
        }

        public final StateValue getSTATE_ON() {
            return ParticipantStatesManagerImpl.STATE_ON;
        }

        public /* synthetic */ Companion(z84 z84Var) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl$State;", "", "key", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "HAND_RAISED", "ASSISTANCE_REQUESTED", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ u25 $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        private final String key;
        public static final State HAND_RAISED = new State("HAND_RAISED", 0, "hand");
        public static final State ASSISTANCE_REQUESTED = new State("ASSISTANCE_REQUESTED", 1, "drat");

        private static final /* synthetic */ State[] $values() {
            return new State[]{HAND_RAISED, ASSISTANCE_REQUESTED};
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = new v25(stateArr$values);
        }

        private State(String str, int i, String str2) {
            this.key = str2;
        }

        public static u25 getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }

        public final String getKey() {
            return this.key;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl$StateValue;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ON", "OFF", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StateValue {
        private static final /* synthetic */ u25 $ENTRIES;
        private static final /* synthetic */ StateValue[] $VALUES;
        private final String value;
        public static final StateValue ON = new StateValue("ON", 0, ParticipantStatesManagerImpl.INTERNAL_STATE_ON);
        public static final StateValue OFF = new StateValue("OFF", 1, ParticipantStatesManagerImpl.INTERNAL_STATE_OFF);

        private static final /* synthetic */ StateValue[] $values() {
            return new StateValue[]{ON, OFF};
        }

        static {
            StateValue[] stateValueArr$values = $values();
            $VALUES = stateValueArr$values;
            $ENTRIES = new v25(stateValueArr$values);
        }

        private StateValue(String str, int i, String str2) {
            this.value = str2;
        }

        public static u25 getEntries() {
            return $ENTRIES;
        }

        public static StateValue valueOf(String str) {
            return (StateValue) Enum.valueOf(StateValue.class, str);
        }

        public static StateValue[] values() {
            return (StateValue[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    public ParticipantStatesManagerImpl(ParticipantStore participantStore, ParticipantStateChanger participantStateChanger, ConversationEventsListener conversationEventsListener, Handler handler) {
        this.store = participantStore;
        this.participantStateChanger = participantStateChanger;
        this.stateListener = conversationEventsListener;
        this.mainThreadHandler = handler;
    }

    private final long getOwnStateSetupTime(State state) {
        ParticipantId externalId = this.store.getMe().getExternalId();
        if (externalId == null) {
            return 0L;
        }
        return getStateSetupTime(externalId, state);
    }

    private final long getStateSetupTime(ParticipantId participantId, State state) {
        Long l;
        Map<bg1, Long> map = this.statesMap.get(state);
        if (map == null || (l = map.get(toInternal(participantId))) == null) {
            return 0L;
        }
        return l.longValue();
    }

    private final boolean isParticipantStateOn(ParticipantId participantId, State state) {
        Map<bg1, Long> map = this.statesMap.get(state);
        if (map != null) {
            return map.containsKey(toInternal(participantId));
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lowerHandForAll$lambda$13(k56 k56Var, JSONObject jSONObject) {
        if (k56Var != null) {
            k56Var.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lowerHandForAll$lambda$14(m56 m56Var, JSONObject jSONObject) {
        if (m56Var != null) {
            m56Var.invoke(new Exception(jSONObject.toString()));
        }
    }

    private final StateValue mapBooleanFlagToStateValue(boolean flag) {
        return flag ? STATE_ON : STATE_OFF;
    }

    private final void notifyCurrentState(State state, ParticipantStatesManager.Listener listener) {
        Map<bg1, Long> map = this.statesMap.get(state);
        if (map == null || map.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<bg1, Long> entry : map.entrySet()) {
            ParticipantId external = toExternal(entry.getKey());
            ParticipantStatesManager.ParticipantStateChange participantStateChange = external == null ? null : new ParticipantStatesManager.ParticipantStateChange(external, true, entry.getValue().longValue());
            if (participantStateChange != null) {
                arrayList.add(participantStateChange);
            }
        }
        listener.onParticipantStateChanged(this, new ParticipantStatesManager.StateChangedEvent(arrayList));
    }

    public static /* synthetic */ void resetStates$default(ParticipantStatesManagerImpl participantStatesManagerImpl, State state, yad yadVar, qod qodVar, qod qodVar2, int i, Object obj) {
        if ((i & 4) != 0) {
            qodVar = null;
        }
        if ((i & 8) != 0) {
            qodVar2 = null;
        }
        participantStatesManagerImpl.resetStates(state, yadVar, qodVar, qodVar2);
    }

    private final ParticipantId toExternal(bg1 bg1Var) {
        ConversationParticipant byInternal = this.store.getByInternal(bg1Var);
        if (byInternal != null) {
            return byInternal.getExternalId();
        }
        return null;
    }

    private final bg1 toInternal(ParticipantId participantId) {
        ConversationParticipant conversationParticipant = this.store.get(participantId);
        if (conversationParticipant != null) {
            return conversationParticipant.getInternalId();
        }
        return null;
    }

    public static /* synthetic */ void updateMyStates$default(ParticipantStatesManagerImpl participantStatesManagerImpl, Map map, qod qodVar, qod qodVar2, int i, Object obj) {
        if ((i & 2) != 0) {
            qodVar = null;
        }
        if ((i & 4) != 0) {
            qodVar2 = null;
        }
        participantStatesManagerImpl.updateMyStates(map, qodVar, qodVar2);
    }

    public static /* synthetic */ void updateOwnState$default(ParticipantStatesManagerImpl participantStatesManagerImpl, State state, StateValue stateValue, qod qodVar, qod qodVar2, int i, Object obj) {
        if ((i & 4) != 0) {
            qodVar = null;
        }
        if ((i & 8) != 0) {
            qodVar2 = null;
        }
        participantStatesManagerImpl.updateOwnState(state, stateValue, qodVar, qodVar2);
    }

    private final void updateOwnStateInternal(Map<String, String> updates, qod listener, qod errorListener) {
        if (updates.isEmpty()) {
            return;
        }
        this.participantStateChanger.changeMyState(updates, new hy0(listener, this, updates, 2), errorListener);
    }

    public static /* synthetic */ void updateOwnStateInternal$default(ParticipantStatesManagerImpl participantStatesManagerImpl, Map map, qod qodVar, qod qodVar2, int i, Object obj) {
        if ((i & 2) != 0) {
            qodVar = null;
        }
        if ((i & 4) != 0) {
            qodVar2 = null;
        }
        participantStatesManagerImpl.updateOwnStateInternal(map, qodVar, qodVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateOwnStateInternal$lambda$19(qod qodVar, ParticipantStatesManagerImpl participantStatesManagerImpl, Map map, JSONObject jSONObject) {
        if (qodVar != null) {
            qodVar.j(jSONObject);
        }
        participantStatesManagerImpl.updateOwnStateInternal(map);
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public void addAssistanceRequestListener(ParticipantStatesManager.Listener listener) {
        Map<State, ParticipantStatesListenerProxy> map = this.listenersMap;
        State state = State.ASSISTANCE_REQUESTED;
        ParticipantStatesListenerProxy participantStatesListenerProxy = map.get(state);
        if (participantStatesListenerProxy == null) {
            participantStatesListenerProxy = new ParticipantStatesListenerProxy(this, this.mainThreadHandler);
            map.put(state, participantStatesListenerProxy);
        }
        participantStatesListenerProxy.addListener(listener);
        notifyCurrentState(state, listener);
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public void addHandListener(ParticipantStatesManager.Listener listener) {
        Map<State, ParticipantStatesListenerProxy> map = this.listenersMap;
        State state = State.HAND_RAISED;
        ParticipantStatesListenerProxy participantStatesListenerProxy = map.get(state);
        if (participantStatesListenerProxy == null) {
            participantStatesListenerProxy = new ParticipantStatesListenerProxy(this, this.mainThreadHandler);
            map.put(state, participantStatesListenerProxy);
        }
        participantStatesListenerProxy.addListener(listener);
        notifyCurrentState(state, listener);
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public Set<ParticipantId> getAssistanceRequestIds() {
        Map<bg1, Long> map = this.statesMap.get(State.ASSISTANCE_REQUESTED);
        Set<ParticipantId> setH0 = null;
        Set<bg1> setKeySet = map != null ? map.keySet() : null;
        if (setKeySet != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                ParticipantId external = toExternal((bg1) it.next());
                if (external != null) {
                    arrayList.add(external);
                }
            }
            setH0 = x53.H0(arrayList);
        }
        return setH0 == null ? wz4.a : setH0;
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public long getAssistanceRequestTime() {
        return getOwnStateSetupTime(State.ASSISTANCE_REQUESTED);
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public long getHandRaiseTime(ParticipantId participantId) {
        return getStateSetupTime(participantId, State.HAND_RAISED);
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public long getOwnHandRaiseTime() {
        return getOwnStateSetupTime(State.HAND_RAISED);
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public Set<ParticipantId> getRaisedHandIds() {
        Map<bg1, Long> map = this.statesMap.get(State.HAND_RAISED);
        Set<ParticipantId> setH0 = null;
        Set<bg1> setKeySet = map != null ? map.keySet() : null;
        if (setKeySet != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                ParticipantId external = toExternal((bg1) it.next());
                if (external != null) {
                    arrayList.add(external);
                }
            }
            setH0 = x53.H0(arrayList);
        }
        return setH0 == null ? wz4.a : setH0;
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public boolean isAssistanceRequested() {
        return isOwnStateOn(State.ASSISTANCE_REQUESTED);
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public boolean isHandRaised(ParticipantId participantId) {
        return isParticipantStateOn(participantId, State.HAND_RAISED);
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public boolean isOwnHandRaised() {
        return isOwnStateOn(State.HAND_RAISED);
    }

    public final boolean isOwnStateOn(State state) {
        ParticipantId externalId = this.store.getMe().getExternalId();
        if (externalId == null) {
            return false;
        }
        return isParticipantStateOn(externalId, state);
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public void lowerHandForAll(k56 onSuccess, m56 onError) {
        this.participantStateChanger.lowerHandForAll(new mt(7, onSuccess), new nt(9, onError));
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public void lowerHandParticipant(ParticipantId participantId) {
        ParticipantStateChanger participantStateChanger = this.participantStateChanger;
        ConversationParticipant conversationParticipant = this.store.get(participantId);
        bg1 internalId = conversationParticipant != null ? conversationParticipant.getInternalId() : null;
        if (internalId == null) {
            return;
        }
        ParticipantStateChanger.changeParticipantState$default(participantStateChanger, internalId, Collections.singletonMap(State.HAND_RAISED.getKey(), INTERNAL_STATE_OFF), null, null, 8, null);
    }

    public final void onParticipantsRemoved(List<? extends ConversationParticipant> participants) {
        for (ConversationParticipant conversationParticipant : participants) {
            Iterator<T> it = this.statesMap.values().iterator();
            while (it.hasNext()) {
                ((Map) it.next()).remove(conversationParticipant.getInternalId());
            }
        }
    }

    public final void onStateChanged(bg1 participantId, dg1 newState) {
        ParticipantId external;
        ParticipantStatesListenerProxy participantStatesListenerProxy;
        x1 x1Var = (x1) State.getEntries();
        x1Var.getClass();
        u1 u1Var = new u1(0, x1Var);
        while (u1Var.hasNext()) {
            State state = (State) u1Var.next();
            cg1 cg1Var = (cg1) newState.a.get(state.getKey());
            ParticipantStatesManager.ParticipantStateChange participantStateChange = null;
            String str = cg1Var != null ? cg1Var.a : null;
            if (tpa.f(str, INTERNAL_STATE_ON)) {
                Map<State, Map<bg1, Long>> map = this.statesMap;
                Map<bg1, Long> linkedHashMap = map.get(state);
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap<>();
                    map.put(state, linkedHashMap);
                }
                linkedHashMap.put(participantId, Long.valueOf(cg1Var.b));
                ParticipantId external2 = toExternal(participantId);
                if (external2 != null) {
                    participantStateChange = new ParticipantStatesManager.ParticipantStateChange(external2, true, cg1Var.b);
                }
            } else if (tpa.f(str, INTERNAL_STATE_OFF)) {
                Map<bg1, Long> map2 = this.statesMap.get(state);
                if ((map2 != null ? map2.remove(participantId) : null) != null && (external = toExternal(participantId)) != null) {
                    participantStateChange = new ParticipantStatesManager.ParticipantStateChange(external, false, 0L);
                }
            }
            if (participantStateChange != null && (participantStatesListenerProxy = this.listenersMap.get(state)) != null) {
                participantStatesListenerProxy.onParticipantStateChanged(this, new ParticipantStatesManager.StateChangedEvent(Collections.singletonList(participantStateChange)));
            }
        }
    }

    public final void release() {
        Iterator<T> it = this.listenersMap.values().iterator();
        while (it.hasNext()) {
            ((ParticipantStatesListenerProxy) it.next()).release();
        }
        this.listenersMap.clear();
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public void removeAssistanceRequestListener(ParticipantStatesManager.Listener listener) {
        ParticipantStatesListenerProxy participantStatesListenerProxy = this.listenersMap.get(State.ASSISTANCE_REQUESTED);
        if (participantStatesListenerProxy != null) {
            participantStatesListenerProxy.removeListener(listener);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public void removeHandListener(ParticipantStatesManager.Listener listener) {
        ParticipantStatesListenerProxy participantStatesListenerProxy = this.listenersMap.get(State.HAND_RAISED);
        if (participantStatesListenerProxy != null) {
            participantStatesListenerProxy.removeListener(listener);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public void resetAssistanceRequests(yad roomId) {
        resetStates$default(this, State.ASSISTANCE_REQUESTED, roomId, null, null, 12, null);
    }

    public final void resetStates(State state, yad roomId, qod listener, qod errorListener) {
        Set<bg1> setKeySet;
        Map<bg1, Long> map = this.statesMap.get(state);
        if (map == null || (setKeySet = map.keySet()) == null) {
            return;
        }
        Collection<ConversationParticipant> participants = this.store.getParticipants(roomId);
        ArrayList arrayList = new ArrayList(z53.S(participants, 10));
        Iterator<T> it = participants.iterator();
        while (it.hasNext()) {
            arrayList.add(((ConversationParticipant) it.next()).getInternalId());
        }
        Set setH0 = x53.H0(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : setKeySet) {
            if (setH0.contains((bg1) obj)) {
                arrayList2.add(obj);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            this.participantStateChanger.changeParticipantState((bg1) it2.next(), Collections.singletonMap(state.getKey(), INTERNAL_STATE_OFF), listener, errorListener);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public void setAssistanceRequested(boolean isRequested) {
        updateOwnState$default(this, State.ASSISTANCE_REQUESTED, isRequested ? STATE_ON : STATE_OFF, null, null, 12, null);
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public void setOwnHandRaised(boolean isRaised) {
        updateOwnState$default(this, State.HAND_RAISED, isRaised ? STATE_ON : STATE_OFF, null, null, 12, null);
    }

    public final void updateMyStates(Map<State, ? extends StateValue> map) {
        updateMyStates$default(this, map, null, null, 6, null);
    }

    public final void updateOwnState(Map<String, String> map) {
        updateOwnState$default(this, map, null, null, 6, null);
    }

    public static /* synthetic */ void updateOwnState$default(ParticipantStatesManagerImpl participantStatesManagerImpl, Map map, qod qodVar, qod qodVar2, int i, Object obj) {
        if ((i & 2) != 0) {
            qodVar = null;
        }
        if ((i & 4) != 0) {
            qodVar2 = null;
        }
        participantStatesManagerImpl.updateOwnState((Map<String, String>) map, qodVar, qodVar2);
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public long getAssistanceRequestTime(ParticipantId participantId) {
        return getStateSetupTime(participantId, State.ASSISTANCE_REQUESTED);
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public boolean isAssistanceRequested(ParticipantId participantId) {
        return isParticipantStateOn(participantId, State.ASSISTANCE_REQUESTED);
    }

    public final void updateMyStates(Map<State, ? extends StateValue> map, qod qodVar) {
        updateMyStates$default(this, map, qodVar, null, 4, null);
    }

    public final void updateOwnState(Map<String, String> map, qod qodVar) {
        updateOwnState$default(this, map, qodVar, null, 4, null);
    }

    private final void updateOwnStateInternal(Map<String, String> updates) {
        ConversationParticipant me2 = this.store.getMe();
        bg1 internalId = me2.getInternalId();
        dg1 dg1Var = new dg1(internalId);
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (Map.Entry<String, String> entry : updates.entrySet()) {
            dg1Var.a.put(entry.getKey(), new cg1(entry.getValue(), jCurrentTimeMillis));
        }
        this.stateListener.onStateChanged(me2, dg1Var);
        onStateChanged(internalId, dg1Var);
    }

    public final void updateMyStates(Map<State, ? extends StateValue> states, qod listener, qod errorListener) {
        bg1 internalId = this.store.getMe().getInternalId();
        if (internalId == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<State, ? extends StateValue> entry : states.entrySet()) {
            StateValue value = entry.getValue();
            Map<bg1, Long> map = this.statesMap.get(entry.getKey());
            if (value != mapBooleanFlagToStateValue(map != null ? map.containsKey(internalId) : false)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            arrayList.add(new kpa(((State) entry2.getKey()).getKey(), ((StateValue) entry2.getValue()).getValue()));
        }
        updateOwnStateInternal(mz7.c0(arrayList), listener, errorListener);
    }

    public final void updateOwnState(State state, StateValue stateValue) {
        updateOwnState$default(this, state, stateValue, null, null, 12, null);
    }

    public final void updateOwnState(State state, StateValue stateValue, qod qodVar) {
        updateOwnState$default(this, state, stateValue, qodVar, null, 8, null);
    }

    public final void updateOwnState(State state, StateValue isOn, qod listener, qod errorListener) {
        updateMyStates(Collections.singletonMap(state, isOn), listener, errorListener);
    }

    public final void updateOwnState(Map<String, String> states, qod listener, qod errorListener) {
        updateOwnStateInternal(states, listener, errorListener);
    }
}
