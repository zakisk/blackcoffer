package com.blackcoffer.ui.explore_screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import com.blackcoffer.ui.explore_screen.components.IndividualTabContent
import com.blackcoffer.ui.explore_screen.components.MerchantTabContent
import com.blackcoffer.ui.explore_screen.components.ProfessionalTabContent
import com.blackcoffer.ui.theme.Elephant
import com.blackcoffer.ui.theme.LocalSpacing
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ExploreScreen() {
    var selected by remember { mutableIntStateOf(0) }
    val tabs = listOf("INDIVIDUAL", "PROFESSIONAL", "MERCHANT")
    val scope = rememberCoroutineScope()
    val state = rememberPagerState { tabs.size }
    selected = state.currentPage
    Column(modifier = Modifier.fillMaxWidth()) {
        TabRow(
            selectedTabIndex = selected,
            containerColor = Color.Elephant,
            contentColor = Color.White,
            indicator = @Composable { tabPositions ->
                if (selected < tabPositions.size) {
                    TabRowDefaults.Indicator(
                        Modifier.tabIndicatorOffset(tabPositions[selected]),
                        color = Color.White
                    )
                }
            }
        ) {
            tabs.forEachIndexed { index, tab ->
                Tab(
                    selected = selected == index,
                    onClick = {
                        scope.launch { state.animateScrollToPage(index) }
                        selected = index
                    },
                    selectedContentColor = Color.White,
                    unselectedContentColor = Color.White.copy(alpha = .8F)
                ) {
                    Text(
                        modifier = Modifier.padding(
                            horizontal = LocalSpacing.current.small,
                            vertical = LocalSpacing.current.medium,
                        ),
                        text = tab,
                        style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.Bold)
                    )
                }
            }
        }

        HorizontalPager(state = state) { page ->
            when (page) {
                0 -> IndividualTabContent()
                1 -> ProfessionalTabContent()
                2 -> MerchantTabContent()
            }
        }
    }
}