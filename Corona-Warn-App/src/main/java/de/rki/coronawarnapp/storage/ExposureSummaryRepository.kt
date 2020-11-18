package de.rki.coronawarnapp.storage

import com.google.android.gms.nearby.exposurenotification.ExposureWindow
import de.rki.coronawarnapp.risk.result.AggregatedRiskResult
import javax.inject.Inject

class ExposureSummaryRepository @Inject constructor() {

    private var entities: Pair<List<ExposureWindow>, AggregatedRiskResult?> = Pair(emptyList(), null)

    var exposureWindowEntities: Pair<List<ExposureWindow>, AggregatedRiskResult?>
        get() = entities
        set(value) {
            entities = value
        }
}
