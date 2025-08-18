package ru.ok.android.externcalls.sdk.urlsharing.external.internal.listener;

import defpackage.a4c;
import defpackage.ao1;
import defpackage.ewc;
import defpackage.jpd;
import defpackage.nl1;
import defpackage.ol1;
import defpackage.pl1;
import defpackage.ql1;
import defpackage.rl1;
import defpackage.tpa;
import defpackage.ule;
import defpackage.xad;
import defpackage.z84;
import defpackage.zad;
import defpackage.zn1;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.mapping.IdMappingResolver;
import ru.ok.android.externcalls.sdk.urlsharing.external.UrlSharingInfo;
import ru.ok.android.externcalls.sdk.urlsharing.external.UrlSharingListener;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 52\u00020\u00012\u00020\u00022\u00020\u0003:\u00015B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0018\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010#\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00102\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010+R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001c0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R$\u00101\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u0001000/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u00066"}, d2 = {"Lru/ok/android/externcalls/sdk/urlsharing/external/internal/listener/UrlSharingListenerManagerImpl;", "Lru/ok/android/externcalls/sdk/urlsharing/external/internal/listener/UrlSharingListenerManager;", "Lao1;", "Lrl1;", "Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;", "idMappingResolver", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "idMappingWrapper", "La4c;", "logger", "<init>", "(Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;La4c;)V", "Lzad;", "roomId", "Ljpd;", "info", "Le5f;", "saveUrlSharing", "(Lzad;Ljpd;)V", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "initiator", "", "url", "saveUrlSharingWithId", "(Lzad;Lru/ok/android/externcalls/sdk/id/ParticipantId;Ljava/lang/String;)V", "reportForActiveRoom", "()V", "Lru/ok/android/externcalls/sdk/urlsharing/external/UrlSharingListener;", "listener", "addListener", "(Lru/ok/android/externcalls/sdk/urlsharing/external/UrlSharingListener;)V", "removeListener", "Lzn1;", "state", "onUrlSharingInfoUpdated", "(Lzn1;)V", "Lnl1;", "params", "onCurrentParticipantActiveRoomChanged", "(Lnl1;)V", "Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "La4c;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "listeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "", "Lru/ok/android/externcalls/sdk/urlsharing/external/UrlSharingInfo;", "roomIdToUrlSharingInfo", "Ljava/util/Map;", "activeRoomId", "Lzad;", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class UrlSharingListenerManagerImpl implements UrlSharingListenerManager, ao1, rl1 {
    private static final Companion Companion = new Companion(null);
    private static final String LOG_TAG = "UrlSharingListenerManagerImpl";
    private final IdMappingResolver idMappingResolver;
    private final IdMappingWrapper idMappingWrapper;
    private final a4c logger;
    private final CopyOnWriteArraySet<UrlSharingListener> listeners = new CopyOnWriteArraySet<>();
    private Map<zad, UrlSharingInfo> roomIdToUrlSharingInfo = new HashMap();
    private zad activeRoomId = xad.a;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/urlsharing/external/internal/listener/UrlSharingListenerManagerImpl$Companion;", "", "()V", "LOG_TAG", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(z84 z84Var) {
            this();
        }
    }

    public UrlSharingListenerManagerImpl(IdMappingResolver idMappingResolver, IdMappingWrapper idMappingWrapper, a4c a4cVar) {
        this.idMappingResolver = idMappingResolver;
        this.idMappingWrapper = idMappingWrapper;
        this.logger = a4cVar;
    }

    private final void reportForActiveRoom() {
        UrlSharingInfo urlSharingInfo = this.roomIdToUrlSharingInfo.get(this.activeRoomId);
        Iterator<UrlSharingListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            UrlSharingListener next = it.next();
            if (urlSharingInfo == null) {
                next.onUrlSharingStopped();
            } else {
                next.onUrlSharingStarted(urlSharingInfo);
            }
        }
    }

    private final void saveUrlSharing(zad roomId, jpd info) {
        ParticipantId byInternal = this.idMappingWrapper.getByInternal(info.a);
        if (byInternal != null) {
            saveUrlSharingWithId(roomId, byInternal, info.b);
        } else {
            this.idMappingResolver.resolveExternalsByInternalsIds(Collections.singletonList(info.a), new ewc(this, info, roomId, 9), new ule(9, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void saveUrlSharing$lambda$0(UrlSharingListenerManagerImpl urlSharingListenerManagerImpl, jpd jpdVar, zad zadVar) {
        ParticipantId byInternal = urlSharingListenerManagerImpl.idMappingWrapper.getByInternal(jpdVar.a);
        if (byInternal == null) {
            return;
        }
        urlSharingListenerManagerImpl.saveUrlSharingWithId(zadVar, byInternal, jpdVar.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void saveUrlSharing$lambda$1(UrlSharingListenerManagerImpl urlSharingListenerManagerImpl) {
        urlSharingListenerManagerImpl.logger.log(LOG_TAG, "Can't resolve internal id");
    }

    private final void saveUrlSharingWithId(zad roomId, ParticipantId initiator, String url) {
        this.roomIdToUrlSharingInfo.put(roomId, new UrlSharingInfo(url, initiator));
        if (tpa.f(roomId, this.activeRoomId)) {
            reportForActiveRoom();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.urlsharing.external.internal.listener.UrlSharingListenerManager
    public void addListener(UrlSharingListener listener) {
        this.listeners.add(listener);
        UrlSharingInfo urlSharingInfo = this.roomIdToUrlSharingInfo.get(this.activeRoomId);
        if (urlSharingInfo != null) {
            listener.onUrlSharingStarted(urlSharingInfo);
        }
    }

    @Override // defpackage.rl1
    public void onCurrentParticipantActiveRoomChanged(nl1 params) {
        zad zadVar = this.activeRoomId;
        zad zadVar2 = params.a;
        if (tpa.f(zadVar, zadVar2)) {
            return;
        }
        this.activeRoomId = zadVar2;
        reportForActiveRoom();
    }

    @Override // defpackage.rl1
    public /* bridge */ /* synthetic */ void onCurrentParticipantInvitedToRoom(ol1 ol1Var) {
    }

    @Override // defpackage.rl1
    public /* bridge */ /* synthetic */ void onRoomRemoved(pl1 pl1Var) {
    }

    @Override // defpackage.rl1
    public /* bridge */ /* synthetic */ void onRoomUpdated(ql1 ql1Var) {
    }

    @Override // defpackage.ao1
    public void onUrlSharingInfoUpdated(zn1 state) {
        zad zadVar = state.a;
        jpd jpdVar = state.b;
        if (jpdVar != null) {
            saveUrlSharing(zadVar, jpdVar);
            return;
        }
        this.roomIdToUrlSharingInfo.put(zadVar, null);
        if (tpa.f(zadVar, this.activeRoomId)) {
            reportForActiveRoom();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.urlsharing.external.internal.listener.UrlSharingListenerManager
    public void removeListener(UrlSharingListener listener) {
        this.listeners.remove(listener);
    }
}
