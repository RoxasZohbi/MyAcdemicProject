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
    public sealed partial class TajMahal : Page
    {
        public TajMahal()
        {
            this.InitializeComponent();
            RingAnimation.Begin();
            DispatcherTimer timer1 = new DispatcherTimer();
            timer1.Interval = TimeSpan.FromSeconds(2);
            timer1.Tick += timer_tick;
            timer1.Start();
        }

        void timer_tick(object sender, object e)
        {
            int count = GalleryView.Items.Count;
            int indexCount = (GalleryView.SelectedIndex + 1) % count;
            GalleryView.SelectedIndex = indexCount;
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

        private void BackBtn_PointerEntered(object sender, PointerRoutedEventArgs e)
        {
            BackBtn.Source = new BitmapImage(new Uri("ms-appx:///Assets/Back2.png", UriKind.Absolute));
        }

        private void BackBtn_PointerPressed(object sender, PointerRoutedEventArgs e)
        {
            BackBtn.Source = new BitmapImage(new Uri("ms-appx:///Assets/Back3.png", UriKind.Absolute));
            Window.Current.Content = new NewWonder();
            Window.Current.Activate();
        }

        private void BackBtn_PointerExited(object sender, PointerRoutedEventArgs e)
        {
            BackBtn.Source = new BitmapImage(new Uri("ms-appx:///Assets/Back1.png", UriKind.Absolute));
        }

    }
}
