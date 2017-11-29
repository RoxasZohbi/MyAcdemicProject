using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Runtime.InteropServices.WindowsRuntime;
using Windows.Foundation;
using Windows.Foundation.Collections;
using Windows.UI.Xaml;
using Windows.UI.Xaml.Controls;
using Windows.UI.Xaml.Controls.Primitives;
using Windows.UI.Xaml.Data;
using Windows.UI.Xaml.Input;
using Windows.UI.Xaml.Media;
using Windows.UI.Xaml.Media.Imaging;
using Windows.UI.Xaml.Navigation;

// The Blank Page item template is documented at http://go.microsoft.com/fwlink/?LinkId=234238

namespace E_Project_SevenWonders
{
    /// <summary>
    /// An empty page that can be used on its own or navigated to within a Frame.
    /// </summary>
    public sealed partial class WaterWonder : Page
    {
        DateTime changeLast;
        public WaterWonder()
        {
            this.InitializeComponent();
            RingAnimation.Begin();

            DispatcherTimer timer1 = new DispatcherTimer();
            timer1.Interval = TimeSpan.FromSeconds(2);
            timer1.Tick += timer_tick;
            timer1.Start();

            DispatcherTimer timer2 = new DispatcherTimer();
            timer2.Interval = TimeSpan.FromSeconds(3);
            timer2.Tick += timer_tick2;
            timer2.Start();

            DispatcherTimer timer3 = new DispatcherTimer();
            timer3.Interval = TimeSpan.FromSeconds(5);
            timer3.Tick += timer_tick3;
            timer3.Start();

            DispatcherTimer timer4 = new DispatcherTimer();
            timer4.Interval = TimeSpan.FromSeconds(9);
            timer4.Tick += timer_tick4;
            timer4.Start();

            DispatcherTimer timer5 = new DispatcherTimer();
            timer5.Interval = TimeSpan.FromSeconds(7);
            timer5.Tick += timer_tick5;
            timer5.Start();

            DispatcherTimer timer6 = new DispatcherTimer();
            timer6.Interval = TimeSpan.FromSeconds(4);
            timer6.Tick += timer_tick6;
            timer6.Start();

            DispatcherTimer timer7 = new DispatcherTimer();
            timer7.Interval = TimeSpan.FromSeconds(3);
            timer7.Tick += timer_tick7;
            timer7.Start();
        }

        void timer_tick(object sender, object e)
        {
            int count = flipslide1.Items.Count;
            int indexCount = (flipslide1.SelectedIndex + 1) % count;
            flipslide1.SelectedIndex = indexCount;
        }

        void timer_tick2(object sender, object e)
        {
            int count = flipslide2.Items.Count;
            int indexCount = (flipslide2.SelectedIndex + 1) % count;
            flipslide2.SelectedIndex = indexCount;
        }

        void timer_tick3(object sender, object e)
        {
            int count = flipslide3.Items.Count;
            int indexCount = (flipslide3.SelectedIndex + 1) % count;
            flipslide3.SelectedIndex = indexCount;
        }

        void timer_tick4(object sender, object e)
        {
            int count = flipslide4.Items.Count;
            int indexCount = (flipslide4.SelectedIndex + 1) % count;
            flipslide4.SelectedIndex = indexCount;
        }

        void timer_tick5(object sender, object e)
        {
            int count = flipslide5.Items.Count;
            int indexCount = (flipslide5.SelectedIndex + 1) % count;
            flipslide5.SelectedIndex = indexCount;
        }

        void timer_tick6(object sender, object e)
        {
            int count = flipslide6.Items.Count;
            int indexCount = (flipslide6.SelectedIndex + 1) % count;
            flipslide6.SelectedIndex = indexCount;
        }

        void timer_tick7(object sender, object e)
        {
            int count = flipslide7.Items.Count;
            int indexCount = (flipslide7.SelectedIndex + 1) % count;
            flipslide7.SelectedIndex = indexCount;
        }

        private void flipslide_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            var starttime = DateTime.Now;
            changeLast = starttime;
        }

        
        private void SearchBox_QuerySubmitted(SearchBox sender, SearchBoxQuerySubmittedEventArgs args)
        {
            if (!string.IsNullOrEmpty(args.QueryText))
            {
                string query = args.QueryText.ToLower();
                foreach (string sample in won)
                {
                    string item = sample.ToLower();
                    if (item.Contains(query))
                    {
                        if (item.Equals(won[0].ToLower()))
                        {
                            Window.Current.Content = new Aurora();
                        }
                        else if (item.Equals(won[1].ToLower()))
                        {
                            Window.Current.Content = new GrandCanyon();
                        }
                        else if (item.Equals(won[2].ToLower()))
                        {
                            Window.Current.Content = new GreatBarrierReef();
                        }
                        else if (item.Equals(won[3].ToLower()))
                        {
                            Window.Current.Content = new Harbor();
                        }
                        else if (item.Equals(won[4].ToLower()))
                        {
                            Window.Current.Content = new MountEve();
                        }
                        else if (item.Equals(won[5].ToLower()))
                        {
                            Window.Current.Content = new Paricutin();
                        }
                        else if (item.Equals(won[6].ToLower()))
                        {
                            Window.Current.Content = new VictoriaFall();
                        }
                        else if (item.Equals(won[7].ToLower()))
                        {
                            Window.Current.Content = new WallChina();
                        }
                        else if (item.Equals(won[8].ToLower()))
                        {
                            Window.Current.Content = new Petra();
                        }
                        else if (item.Equals(won[9].ToLower()))
                        {
                            Window.Current.Content = new Redeemer();
                        }
                        else if (item.Equals(won[10].ToLower()))
                        {
                            Window.Current.Content = new MachuPicchu();
                        }
                        else if (item.Equals(won[11].ToLower()))
                        {
                            Window.Current.Content = new ChichenItza();
                        }
                        else if (item.Equals(won[12].ToLower()))
                        {
                            Window.Current.Content = new Colosseum();
                        }
                        else if (item.Equals(won[13].ToLower()))
                        {
                            Window.Current.Content = new TajMahal();
                        }
                        else if (item.Equals(won[14].ToLower()))
                        {
                            Window.Current.Content = new IguazuFalls();
                        }
                        else if (item.Equals(won[15].ToLower()))
                        {
                            Window.Current.Content = new HaLong();
                        }
                        else if (item.Equals(won[16].ToLower()))
                        {
                            Window.Current.Content = new JejuIsland();
                        }
                        else if (item.Equals(won[17].ToLower()))
                        {
                            Window.Current.Content = new NationalPark();
                        }
                        else if (item.Equals(won[18].ToLower()))
                        {
                            Window.Current.Content = new TableMountain();
                        }
                        else if (item.Equals(won[19].ToLower()))
                        {
                            Window.Current.Content = new Komodo();
                        }
                        else if (item.Equals(won[20].ToLower()))
                        {
                            Window.Current.Content = new AmazonRainforest();
                        }
                        else if (item.Equals(won[21].ToLower()))
                        {
                            Window.Current.Content = new Durban();
                        }
                        else if (item.Equals(won[22].ToLower()))
                        {
                            Window.Current.Content = new Vigan();
                        }
                        else if (item.Equals(won[23].ToLower()))
                        {
                            Window.Current.Content = new Havana();
                        }
                        else if (item.Equals(won[24].ToLower()))
                        {
                            Window.Current.Content = new KualaLumpur();
                        }
                        else if (item.Equals(won[25].ToLower()))
                        {
                            Window.Current.Content = new Beirut();
                        }
                        else if (item.Equals(won[26].ToLower()))
                        {
                            Window.Current.Content = new Doha();
                        }
                        else if (item.Equals(won[27].ToLower()))
                        {
                            Window.Current.Content = new LaPaz();
                        }
                        else if (item.Equals(won[28].ToLower()))
                        {
                            Window.Current.Content = new Palau();
                        }
                        else if (item.Equals(won[29].ToLower()))
                        {
                            Window.Current.Content = new BelizeBarrierReef();
                        }
                        else if (item.Equals(won[30].ToLower()))
                        {
                            Window.Current.Content = new HydrothermalVent();
                        }
                        else if (item.Equals(won[31].ToLower()))
                        {
                            Window.Current.Content = new GalápagosIslands();
                        }
                        else if (item.Equals(won[32].ToLower()))
                        {
                            Window.Current.Content = new LakeBaikal();
                        }
                        else if (item.Equals(won[33].ToLower()))
                        {
                            Window.Current.Content = new RedSea();
                        }
                        Window.Current.Activate();
                        break;

                    }
                }
            }
        }

        private void SearchBox_SuggestionsRequested(SearchBox sender, SearchBoxSuggestionsRequestedEventArgs args)
        {
            if (!string.IsNullOrEmpty(args.QueryText))
            {
                foreach (string item in won)
                {
                    if (item.StartsWith(args.QueryText, StringComparison.CurrentCultureIgnoreCase))
                    {
                        args.Request.SearchSuggestionCollection.AppendQuerySuggestion(item);
                    }
                }
            }
        }




        List<string> won = new List<string> { "Aurora", "Grand Canyon", "Great Barrier Reef", "Harbor of Rio de Janeiro", "Mount Everest", "Parícutin Volcano", "Victoria Falls", "Great Wall of China", "Petra", "Machu Picchu", "Christ the Redeemer", "Chichen Itza", "Colosseum", "Taj Mahal", "Iguazu Falls", "Hạ Long", "Jeju Island", "Puerto Princesa Underground River", "Table Mountain", "Komodo", "Amazon rainforest", "Durban", "Vigan", "Havana", "Kuala Lumpur", "Beirut", "Doha", "La Paz", "Palau", "Belize Barrier Reef", "Deep-Sea Vents", "Galápagos Islands", "Lake Baikal", "Northern Red Sea" };

        private void StackPanel_PointerEntered(object sender, PointerRoutedEventArgs e)
        {
            if (sender.Equals(home))
            {
                HomeAnimation.Begin();
            }
            else if (sender.Equals(wonders))
            {
                WonderAnimation.Begin();
            }
            else if (sender.Equals(maps))
            {
                MapsAnimation.Begin();
            }

        }

        private void textBlock_PointerPressed(object sender, PointerRoutedEventArgs e)
        {
            if (sender.Equals(HomeBtn))
            {
                Window.Current.Content = new Home();
                Window.Current.Activate();
            }
            else if (sender.Equals(WondersBtn))
            {
                Window.Current.Content = new Wonders();
                Window.Current.Activate();
            }
            else if (sender.Equals(MapsBtn))
            {
                Window.Current.Content = new WonderMap();
                Window.Current.Activate();
            }
        }


        private void home_PointerExited(object sender, PointerRoutedEventArgs e)
        {
            //var HoverEffect = sender as StackPanel;
            //HoverEffect.Background = new SolidColorBrush(Color.FromArgb(255, 255, 255, 255));
        }

        private void UnderWater_Click(object sender, RoutedEventArgs e)
        {
            if (sender.Equals(PalauRead))
            {
                Window.Current.Content = new Palau();
                Window.Current.Activate();
            }
            else if (sender.Equals(BelizeBarrierReefRead))
            {
                Window.Current.Content = new BelizeBarrierReef();
                Window.Current.Activate();
            }
            else if (sender.Equals(GreatBarrierReefRead))
            {
                Window.Current.Content = new GreatBarrierReef2();
                Window.Current.Activate();
            }
            else if (sender.Equals(DeepSeaVentsRead))
            {
                Window.Current.Content = new HydrothermalVent();
                Window.Current.Activate();
            }
            else if (sender.Equals(GalapagosIslandsRead))
            {
                Window.Current.Content = new GalápagosIslands();
                Window.Current.Activate();
            }
            if (sender.Equals(LakeBaikalRead))
            {
                Window.Current.Content = new LakeBaikal();
                Window.Current.Activate();
            }
            if (sender.Equals(NorthernRedSeaRead))
            {
                Window.Current.Content = new RedSea();
                Window.Current.Activate();
            }
        }

        private void BackBtn_PointerEntered(object sender, PointerRoutedEventArgs e)
        {
            BackBtn.Source = new BitmapImage(new Uri("ms-appx:///Assets/Back2.png", UriKind.Absolute));
        }

        private void BackBtn_PointerPressed(object sender, PointerRoutedEventArgs e)
        {
            BackBtn.Source = new BitmapImage(new Uri("ms-appx:///Assets/Back3.png", UriKind.Absolute));
            Window.Current.Content = new Home();
            Window.Current.Activate();
        }

        private void BackBtn_PointerExited(object sender, PointerRoutedEventArgs e)
        {
            BackBtn.Source = new BitmapImage(new Uri("ms-appx:///Assets/Back1.png", UriKind.Absolute));
        }
    }
}
