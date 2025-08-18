package ru.ok.android.externcalls.sdk.feature.internal.listener;

import defpackage.bcd;
import defpackage.oz4;
import defpackage.tpa;
import defpackage.u61;
import defpackage.wz4;
import defpackage.x61;
import defpackage.y61;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager;
import ru.ok.android.externcalls.sdk.feature.roles.FeatureRoles;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000f\u001a\u00020\u000e2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0013\u001a\u00020\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b$\u0010%R&\u0010(\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160'0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\"\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ok/android/externcalls/sdk/feature/internal/listener/ConversationFeatureListenersImpl;", "Lru/ok/android/externcalls/sdk/feature/internal/listener/ConversationFeatureListeners;", "<init>", "()V", "Ly61;", "event", "", "Lu61;", "Lru/ok/android/externcalls/sdk/feature/roles/FeatureRoles;", "getFeaturesRolesMap", "(Ly61;)Ljava/util/Map;", "", "oldFeatures", "newFeatures", "Le5f;", "notifyListenersWithNewEnabledFeatures", "(Ljava/util/Set;Ljava/util/Set;)V", "oldFeatureRolesMap", "newFeatureRolesMap", "notifyListenersWithNewFeaturesRoles", "(Ljava/util/Map;Ljava/util/Map;)V", "feature", "Lru/ok/android/externcalls/sdk/feature/ConversationFeatureManager$FeatureListener;", "listener", "notifyNewListener", "(Lu61;Lru/ok/android/externcalls/sdk/feature/ConversationFeatureManager$FeatureListener;)V", "addFeatureListener", "removeFeatureListener", "", "isFeatureEnabled", "(Lu61;)Z", "getFeatureRoles", "(Lu61;)Lru/ok/android/externcalls/sdk/feature/roles/FeatureRoles;", "Lx61;", "onFeatureSetChanged", "(Lx61;)V", "onFeaturesPerRoleChanged", "(Ly61;)V", "Ljava/util/EnumMap;", "", "listenersMap", "Ljava/util/EnumMap;", "enabledFeatureSet", "Ljava/util/Set;", "featureRolesMap", "Ljava/util/Map;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ConversationFeatureListenersImpl implements ConversationFeatureListeners {
    private final EnumMap<u61, Set<ConversationFeatureManager.FeatureListener>> listenersMap = new EnumMap<>(u61.class);
    private Set<? extends u61> enabledFeatureSet = wz4.a;
    private Map<u61, ? extends FeatureRoles> featureRolesMap = oz4.a;

    private final Map<u61, FeatureRoles> getFeaturesRolesMap(y61 event) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (u61 u61Var : u61.values()) {
            Set set = (Set) event.a.get(u61Var);
            if (set == null || set.isEmpty()) {
                linkedHashMap.put(u61Var, FeatureRoles.EnabledForAll.INSTANCE);
            } else {
                linkedHashMap.put(u61Var, new FeatureRoles.EnabledForRoles(set));
            }
        }
        return linkedHashMap;
    }

    private final void notifyListenersWithNewEnabledFeatures(Set<? extends u61> oldFeatures, Set<? extends u61> newFeatures) {
        for (u61 u61Var : bcd.Y(newFeatures, oldFeatures)) {
            Set<ConversationFeatureManager.FeatureListener> set = this.listenersMap.get(u61Var);
            if (set != null) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    ((ConversationFeatureManager.FeatureListener) it.next()).onFeatureEnabledChanged(u61Var, false);
                }
            }
        }
        for (u61 u61Var2 : bcd.Y(oldFeatures, newFeatures)) {
            Set<ConversationFeatureManager.FeatureListener> set2 = this.listenersMap.get(u61Var2);
            if (set2 != null) {
                Iterator<T> it2 = set2.iterator();
                while (it2.hasNext()) {
                    ((ConversationFeatureManager.FeatureListener) it2.next()).onFeatureEnabledChanged(u61Var2, true);
                }
            }
        }
    }

    private final void notifyListenersWithNewFeaturesRoles(Map<u61, ? extends FeatureRoles> oldFeatureRolesMap, Map<u61, ? extends FeatureRoles> newFeatureRolesMap) {
        Set<ConversationFeatureManager.FeatureListener> set;
        for (u61 u61Var : bcd.Z(oldFeatureRolesMap.keySet(), newFeatureRolesMap.keySet())) {
            if (!tpa.f(oldFeatureRolesMap.get(u61Var), newFeatureRolesMap.get(u61Var)) && (set = this.listenersMap.get(u61Var)) != null) {
                for (ConversationFeatureManager.FeatureListener featureListener : set) {
                    FeatureRoles.Companion companion = FeatureRoles.INSTANCE;
                    FeatureRoles featureRolesCreateDisabledForAll = newFeatureRolesMap.get(u61Var);
                    if (featureRolesCreateDisabledForAll == null) {
                        featureRolesCreateDisabledForAll = companion.createDisabledForAll();
                    }
                    featureListener.onFeatureRolesChanged(u61Var, featureRolesCreateDisabledForAll);
                }
            }
        }
    }

    private final void notifyNewListener(u61 feature, ConversationFeatureManager.FeatureListener listener) {
        listener.onFeatureEnabledChanged(feature, isFeatureEnabled(feature));
        listener.onFeatureRolesChanged(feature, getFeatureRoles(feature));
    }

    @Override // ru.ok.android.externcalls.sdk.feature.internal.listener.ConversationFeatureListeners
    public void addFeatureListener(u61 feature, ConversationFeatureManager.FeatureListener listener) {
        EnumMap<u61, Set<ConversationFeatureManager.FeatureListener>> enumMap = this.listenersMap;
        Set<ConversationFeatureManager.FeatureListener> hashSet = enumMap.get(feature);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            enumMap.put((EnumMap<u61, Set<ConversationFeatureManager.FeatureListener>>) feature, (u61) hashSet);
        }
        hashSet.add(listener);
        notifyNewListener(feature, listener);
    }

    @Override // ru.ok.android.externcalls.sdk.feature.internal.listener.ConversationFeatureListeners
    public FeatureRoles getFeatureRoles(u61 feature) {
        Map<u61, ? extends FeatureRoles> map = this.featureRolesMap;
        FeatureRoles.Companion companion = FeatureRoles.INSTANCE;
        FeatureRoles featureRolesCreateDisabledForAll = map.get(feature);
        if (featureRolesCreateDisabledForAll == null) {
            featureRolesCreateDisabledForAll = companion.createDisabledForAll();
        }
        return featureRolesCreateDisabledForAll;
    }

    @Override // ru.ok.android.externcalls.sdk.feature.internal.listener.ConversationFeatureListeners
    public boolean isFeatureEnabled(u61 feature) {
        return this.enabledFeatureSet.contains(feature);
    }

    public final void onFeatureSetChanged(x61 event) {
        Set<? extends u61> set = this.enabledFeatureSet;
        Set<? extends u61> set2 = event.a;
        notifyListenersWithNewEnabledFeatures(set, set2);
        this.enabledFeatureSet = set2;
    }

    public final void onFeaturesPerRoleChanged(y61 event) {
        Map<u61, FeatureRoles> featuresRolesMap = getFeaturesRolesMap(event);
        notifyListenersWithNewFeaturesRoles(this.featureRolesMap, featuresRolesMap);
        this.featureRolesMap = featuresRolesMap;
    }

    @Override // ru.ok.android.externcalls.sdk.feature.internal.listener.ConversationFeatureListeners
    public void removeFeatureListener(u61 feature, ConversationFeatureManager.FeatureListener listener) {
        Set<ConversationFeatureManager.FeatureListener> set = this.listenersMap.get(feature);
        if (set != null) {
            set.remove(listener);
        }
    }
}
